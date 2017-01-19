/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scratch;

/**
 *
 * @author Bennett.DenBleyker
 */
public class Card {

    //private Value number;
    private String rank;
    //private Suit suit;
    private String suit;
    private int pointValue;

//    public Card(Value number, Suit suit) {
//        this.number = number;
//        this.suit = suit;
//    }

    public Card(String rank, String suit, int pointValue) {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }
    
    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
    
    public int getPointValue() {
        return pointValue;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
    
    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }
    
    public boolean matches(Card otherCard) {
        return false;
    }

    @Override
    public String toString() {
        return "Card{" + "rank=" + rank + ", suit=" + suit + ", pointValue=" + pointValue + '}';
    }
    
    public static void main(String[] args) {
        //Card x = new Card(Value.Seven, Suit.Diamonds, 1);
        Card x = new Card("A", "Cars", 10);
        System.out.println(x);
    }

}
