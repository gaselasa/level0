/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level0;

/**
 *
 * @author gasela
 */
public class task0_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===================Task 0.9==================");
        printVowels("a b c  f  t d");
    }

    private static void printVowels(String word) {

        for (int j = 0; j < word.length(); j++) {
            char ch = word.charAt(j);

            if (ch == 'a' || ch == 'b' || ch == 'c' || ch == 'd' || ch == 'e'
                    || ch == 'A' || ch == 'B' || ch == 'C' || ch == 'D' || ch == 'E') {
                System.out.print(ch + " ");
            }

        }
        System.out.println();
    }
}
