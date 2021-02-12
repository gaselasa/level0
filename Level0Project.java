/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level0project;

/**
 *
 * @author gasela
 */
public class Level0Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===================Task 0.1==================");
         printValuesXandY();
    }
     static void printValuesXandY(){
        int x=0;
        int y=1;
        
        System.out.println("the value of x  "+x+"\n"+"the value of y " +y);
    x=x+3;
    y=y+x;
    
       System.out.println("the value of x "+x+"\n"+"the value of y "+y);
    
    
    
    }
}
