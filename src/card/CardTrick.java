/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        } 




/**
 * CardTrick class
 * Modifier: [AARUSHI SHARMA], [991708883]
 * Date Modified: [27-05-2024]
 */

import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rand = new Random();

        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};

        // Fill the magic hand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            int value = rand.nextInt(13) + 1;
            String suit = suits[rand.nextInt(4)];
            magicHand[i] = new Card(value, suit);
        }

        // Ask user to pick a card
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a card value (1 to 13): ");
        int userValue = input.nextInt();
        System.out.println("Pick a suit (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = input.next();

        // Search the magic hand for the user's card
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userValue && card.getSuit().equalsIgnoreCase(userSuit)) {
                found = true;
                break;
            }
        }

        // Report whether the user's card is in the magic hand
        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }
    }
}

class Card {
    private int value;
    private String suit;

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }
}























        
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
}
