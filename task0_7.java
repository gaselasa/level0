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
public class task0_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("===================Task 0.7==================");
        System.out.println("celsiusToFahrenheit(10) " + celsiusToFahrenheit(10));
        System.out.println("FahrenheitToCelsius(98.6) " + FahrenheitToCelsius(98.6));
    }

    private static double celsiusToFahrenheit(double celsius) {

        return celsius * (9 / 5.0) + 32;

    }

    private static double FahrenheitToCelsius(double Fahrenheit) {

        return (Fahrenheit - 32) * (5 / 9.0);

    }

}
