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
public class task0_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===================Task 0.4==================");
        checkIsevenOrOdd(9);

    }

    private static void checkIsevenOrOdd(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is  oddd");
        }

    }

}
