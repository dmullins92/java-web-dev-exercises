package org.launchcode.java.studios.countingcharacters;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*String stringToCount = "If the product of two terms is zero then common sense " +
                "says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored allowing that side " +
                "of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";*/
        System.out.println("Please enter a string: ");
        String inputString = input.nextLine();
        inputString = inputString.toLowerCase();
        char[] charArray = inputString.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();

        for(char character : charArray) {
            if(charCount.containsKey(character)) {
                charCount.put(character, charCount.get(character) + 1);
            } else if (Character.isAlphabetic(character)) {
                charCount.put(character, 1);
            }
        }

        for(Map.Entry<Character, Integer> character : charCount.entrySet()) {
            System.out.println(character);
        }
    }
}
