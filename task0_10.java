/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level0;

import java.util.Arrays;

/**
 *
 * @author gasela
 */
public class task0_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===================Task 0.10==================");
        checksameLetters("sanele", "gasela");

    }

    private static void checksameLetters(String first, String last) {

        String newWord = "";

        String word = "";

        for (int i = 0; i < first.length(); i++) {

            char ch1 = first.toLowerCase().charAt(i);
            for (int j = 0; j < last.length(); j++) {

                if (ch1 == last.toLowerCase().charAt(j)) {
                    word = word + ch1;

                }
            }

        }

        System.out.println();

        if (!word.isEmpty()) {

            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            newWord += chars[0] + ",";
            for (int i = 1; i < chars.length; i++) {

                if (chars[i] != chars[i - 1]) {
                    newWord += chars[i] + " ,";
                }

            }

        }
        System.out.print(newWord);

    }
}
