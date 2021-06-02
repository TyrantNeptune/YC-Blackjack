package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] suits = {"h", "r", "s", "c"};
        List<Kaart> deck = new ArrayList<>();
        for (int i = 2; i<15;i++){
            for (String s : suits){
                String face = "";
                int waarde = 0;
                if (i == 11){
                    face = "j";
                    waarde = 10;
                }
                else if (i == 12){
                    face = "q";
                    waarde = 10;
                }
                else if (i == 13){
                    face = "k";
                    waarde = 10;
                }
                else if (i == 14){
                    face = "a";
                    waarde = 11;
                }
                else{
                    face = String.valueOf(i);
                    waarde = i;
                }
                Kaart kaart = new Kaart();
                kaart.naam = s + face;
                kaart.waarde = waarde;
                deck.add(kaart);
            }
        }
        Collections.shuffle(deck);
        Speler speler = new Speler();
        speler.pakKaart(deck);
        speler.pakKaart(deck);
        Scanner scanner = new Scanner(System.in);
        // String input= scanner.nextLine();
    }
}

class Kaart {
    String naam;
    int waarde;
}

class Speler {
    List<Kaart> hand = new ArrayList<>();
    int score;
    void pakKaart(List<Kaart> deck){
        hand.add(deck.get(0));
        System.out.println(deck.get(0).naam);
        deck.remove(0);
    }
}