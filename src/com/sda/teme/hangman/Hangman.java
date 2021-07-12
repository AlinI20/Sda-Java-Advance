package com.sda.teme.hangman;

import java.util.Scanner;

public class Hangman {
    private static String[] words = {"water","balloon","browser","fish","work"};
    private static String word = words[((int) Math.random() * words.length)];
    private static String punct = new String(new char[word.length()]).replace("\0", ".");
    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(count < 3 && punct.contains(".")){
            System.out.println("Guess any letter in the word");
            System.out.println(punct);
            String guess = sc.next();
            hang(guess);
        }
        sc.close();
    }
    public static void hang(String guess){
        String newPunct = "";
        for (int i=0;i< words.length;i++){
            if (word.charAt(i) == guess.charAt(0)){
                newPunct += guess.charAt(0);
            }
            else if (punct.charAt(i) != '.'){
                newPunct += word.charAt(i);
            }
            else{
                newPunct += ".";
            }
        }
        if (punct.equals(newPunct)){
            count++;
            showLives();
        }else{
            punct = newPunct;
        }
        if (punct.equals(word)){
            System.out.println("Correct! You win! The world was " +word);

        }

    }
    public static void showLives(){
        if (count == 1){
            System.out.println("Wrong guess,you lose 1 lives, try again");
        }
        if (count == 2){
            System.out.println("Wrong guess,you lose 1 lives, try again");
        }
        if (count == 3){
            System.out.println("GAME OVER! The world was " + word);
        }
    }

}
