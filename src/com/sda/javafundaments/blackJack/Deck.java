package com.sda.blackJack;

import com.sda.curs7.ex4.engine.Car;

import java.util.ArrayList;
import java.util.List;

public class Deck {

int indexCarteaCurenta = 0;

    private List<Card> cardList;

    public Deck() {
        this.cardList = getCardList();

    }

    @Override
    public String toString() {
        return "Deck{" +
                "cardList=" + "\n" + cardList +
                '}';
    }

    private List<Card> getCardList() {
        List<String> suits = new ArrayList<>();
        List<Card> cardList = new ArrayList<>();
        suits.add("Clubs");
        suits.add("Diamonds");
        suits.add("Hearts");
        suits.add("Spades");
        for (int i = 1; i <= 13; i++) {
            for (String suit : suits) {
                if (i == 1) {
                    Card card = new Card(1, "Ace", suit);
                    cardList.add(card);
                } else if (i == 11) {
                    Card card = new Card(10, "Jack", suit);
                    cardList.add(card);
                } else if (i == 12) {
                    Card card = new Card(10, "Queen", suit);
                    cardList.add(card);
                } else if (i == 13) {
                    Card card = new Card(10, "King", suit);
                    cardList.add(card);
                } else {
                    Card card = new Card(i, String.valueOf(i), suit);
                    cardList.add(card);
                }

            }
        }
        return cardList;
    }

   public void shuffle() {
        for(int i=0; i<1000 ; i++) {
            int randomIndex1 = (int) (Math.random() * 52);
            int randomIndex2 = (int) (Math.random() * 52);
            Card c1 = this.cardList.get(randomIndex1);
            Card c2 = this.cardList.get(randomIndex2);
            this.cardList.set(randomIndex1, c2);
            this.cardList.set(randomIndex2, c1);
        }

    }
    public Card drawCard(){
        Card drawCards = cardList.get(indexCarteaCurenta);
        indexCarteaCurenta++;
      return drawCards;
    }
}
