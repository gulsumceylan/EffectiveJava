package com.effectivejava.examples.döngüler;

// For vs foreach

import java.util.*;

public class LordOfTheLoops {

    enum Suit{CLUB, DIAMOND, HEART, SPADE}

    enum Rank{ACE,DEUCE,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUIN,KING}

    public static void main(String[] args) {

        Collection<Suit> suits = Arrays.asList(Suit.values());
        Collection<Rank> ranks = Arrays.asList(Rank.values());

        List<Card> deck = new ArrayList<Card>();

        /*  FOR
        Derleme anında hata almaz çalışma anaında hata fırlatır!
        for (Iterator<Suit> i = suits.iterator(); i.hasNext();){
            for(Iterator<Rank> j = ranks.iterator(); j.hasNext(); ){
                deck.add(new Card(i.next(),j.next));
            }
        }
         */

        //  FOREACH
        for (Suit suit:suits){
            for(Rank rank:ranks){
                deck.add(new Card(suit,rank));
            }
        }

        for (Card card:deck) {
            System.out.println(card);
        }

    }
}

class Card{
    LordOfTheLoops.Suit suit;
    LordOfTheLoops.Rank rank;

    public Card(LordOfTheLoops.Suit suit,LordOfTheLoops.Rank rank){
        this.suit=suit;
        this.rank=rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }
}
