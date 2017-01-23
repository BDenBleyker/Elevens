package elevens;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

    /**
     * The number of consecutive shuffle steps to be performed in each call to
     * each sorting procedure.
     */
    private static final int SHUFFLE_COUNT = 10;

    /**
     * Tests shuffling methods.
     *
     * @param args is not used.
     */
    public static void main(String[] args) {
//        System.out.println("Results of " + SHUFFLE_COUNT
//                + " consecutive perfect shuffles:");
//        int[] values1 = {0, 1, 2, 3};
//        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
//            int[] shuffled = perfectShuffle(values1);
//            System.out.print("  " + j + ":");
//            for (int k = 0; k < values1.length; k++) {
//                System.out.print(" " + shuffled[k]);
//            }
//            System.out.println();
//        }
//        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT
                + " consecutive efficient selection shuffles:");
        List<Card> values2 = new ArrayList();
        values2.add(new Card("a", "l", 1));
        values2.add(new Card("b", "z", 6));
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            List<Card> shuffledCards = selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.size(); k++) {
                System.out.print(" " + shuffledCards.toArray()[k]);
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Apply a "perfect shuffle" to the argument. The perfect shuffle algorithm
     * splits the deck in half, then interleaves the cards in one half with the
     * cards in the other.
     *
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static int[] perfectShuffle(int[] values) {
        int[] shuffled = new int[values.length];
        int k = 0;
        for (int j = 0; j < values.length / 2; j++) {
            shuffled[k] = values[j];
            k+=2;
        }
        k = 1;
        for (int j = values.length / 2; j < values.length; j++) {
            shuffled[k] = values[j];
            k+=2;
        }
        return shuffled;
    }

    /**
     * Apply an "efficient selection shuffle" to the argument. The selection
     * shuffle algorithm conceptually maintains two sequences of cards: the
     * selected cards (initially empty) and the not-yet-selected cards
     * (initially the entire deck). It repeatedly does the following until all
     * cards have been selected: randomly remove a card from those not yet
     * selected and add it to the selected cards. An efficient version of this
     * algorithm makes use of arrays to avoid searching for an as-yet-unselected
     * card.
     *
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static List<Card> selectionShuffle(List<Card> values) {
        for (int k = (values.size() - 1); k >= 0; k--) {
            int j = (int) (k * Math.random());
            Card shuffled = values.toArray()[j];
            values.set(j, (Card) values.toArray()[k]);
            values.set(j, (Card) shuffled);
        }
        return values;
    }
}
