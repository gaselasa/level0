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
public class task0_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        System.out.println("===================Task 0.8==================");
        findHoursAndMinute(133);

    }

   private static void findHoursAndMinute(int number) {

        int hours = (int) number / 60;
        int minute = (int) number % 60;

        System.out.println("number has " + hours + " hours");
        System.out.println("number has " + minute + " minute");

    }
  

}
