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
public class task0_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===================Task 0.5==================");
        System.out.println("The area of triangle is given sides [3,5,4] is " + findAreaOTriagle(3, 5, 4));

    }

    private static double findAreaOTriagle(double side1, double side2, double side3) {

        double semiPerimeter = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));

        return area;

    }
}
