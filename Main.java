package com.company.calcium_collision;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // дан массив имен
        //удалить из него все имена заканчивающиеся на "а"

        String[] words = {"hola","moris","lubin","hara","dora","fira","furi"};

        System.out.println(Arrays.toString(cleanArray(words,'a')));

    }

    public static String[] cleanArray(String[] arrayWords, char banLetter){
        // Create StringBuilder
        StringBuilder clearString = new StringBuilder();

        // for-each loop for every word in arrayWords
        for (String word: arrayWords){

            // For clear read - last index of current word
            int lastLetter = word.length()-1;

            // If last letter is not banLetter - add it to clearString
            if (word.charAt(lastLetter) != banLetter){

                // Add word to StringBuilder
                clearString.append(word);

                // Add space for split() by spaces
                clearString.append(" ");
            }

        }

        // Get String from StringBuilder + trim(), cuz its have space at end
        String resultString = clearString.toString().trim();

        // And use split() by spaces for result String[]
        return resultString.split(" ");
    }
}
