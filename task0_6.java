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
public class task0_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===================Task 0.6==================");
        System.out.println("max number between three numbers [8,1,78] is " + findMaxNumber(8, 1, 78));

    }

    private static double findMaxNumber(double firstNumber, double secondNumber, double thirdNumber) {

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            return secondNumber;
        }

        return thirdNumber;

    }

}
