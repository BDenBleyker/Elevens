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
public enum Value {Joker, Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King;
    public static int valueOf (Value v) {
        switch (v) {
            case Joker:
                return 0;
            case Ace:
                return 1;
            case Two:
                return 2;
            case Three:
                return 3;
            case Four:
                return 4;
            case Five:
                return 5;
            case Six:
                return 6;
            case Seven:
                return 7;
            case Eight:
                return 8;
            case Nine:
                return 9;
            case Ten:
                return 10;
            case Jack:
                return 11;
            case Queen:
                return 12;
            case King:
                return 13;
            default:
                return -1;
        }
    }
}
