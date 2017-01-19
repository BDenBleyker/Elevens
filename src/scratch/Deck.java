/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scratch;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bennett.DenBleyker
 */
public class Deck {
    private List<Card> cards = new ArrayList();
    
    public Deck(ArrayList<String> ranks, ArrayList<String> suits, ArrayList<Integer> values) {
        for (String suit : suits) {
            for (String rank : ranks) {
                for (Integer value : values) {
                    cards.add(new Card(rank, suit, value));
                }
            }
        }
    }
    
}
