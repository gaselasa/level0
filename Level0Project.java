/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level0project;

import java.util.Arrays;

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
     
         System.out.println("===================Task 0.2==================");
          learnArithmeatic();
          
          System.out.println("===================Task 0.3==================");
          hello("sanele");
          
           System.out.println("===================Task 0.4==================");
           evenOrOdd(9);
           
            System.out.println("===================Task 0.5==================");
             System.out.println("The area of triangle is "+findAreaOTriagle(3,5,4));
             
             System.out.println("===================Task 0.6==================");
             System.out.println("max number between three numbers"+findMaxNumber(8,1,78));
             
              System.out.println("===================Task 0.7==================");
               System.out.println("celsiusToFahrenheit(10) "+celsiusToFahrenheit(10));
               
                System.out.println("FahrenheitToCelsius(98.6) " +FahrenheitToCelsius(98.6));
               System.out.println("===================Task 0.8==================");
               findHoursAndMinute(133);
                
                System.out.println("===================Task 0.9==================");
                   printVowels("a b c  f  t d");
                
                 System.out.println("===================Task 0.10==================");
                   sameWords("sanele","gasela");
       
        
    }
     static void printValuesXandY(){
        int x=0;
        int y=1;
        
        System.out.println("the value of x  "+x+"\n"+"the value of y " +y);
    x=x+3;
    y=y+x;
    
       System.out.println("the value of x "+x+"\n"+"the value of y "+y);
    
    
    
    }
     static void learnArithmeatic(){
        
        int x=1 + 1 *2;
        int y = (1+1)*2;
        int z= 1 + (1 *2);
        int a=1+1*2/2;
        double b=(1+1*2 )/2;
        
        System.out.println("x is "+x+"\n"+"y is "+y+"\n"+"z is "+z+"\n"
                          +"a is "+a+"\n"+"b is "+b);
        
        
        
        
    }
     
      static void hello(String name){
        
        System.out.println("Hello "+name);
        
        
        
    }
       static void evenOrOdd(int number){
        
        if(number%2==0)
            System.out.println(number+" is even");
        
            else
              System.out.println(number+" is  oddd");
        
        
    }
       
        static double findAreaOTriagle(double side1, double side2, double side3){
        
        double semiPerimeter=(side1+side2+side3)/2;
        double area=Math.sqrt(semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-side3));
        
        
        
        
      
        return area;
        

        
        
    }
     static double findMaxNumber(double firstNumber,double secondNumber,double thirdNumber){
        
       
        
       if(firstNumber>=secondNumber && firstNumber>=thirdNumber)
              return firstNumber;
       
       else if (secondNumber>=firstNumber && secondNumber>=thirdNumber)
            
             return secondNumber;
       
        
        
       
        return thirdNumber;
        
        
        
    }
     static double celsiusToFahrenheit(double celsius){
        
        
        return  celsius*(9/5.0)+32;
        
        
        
        
    }
      static double FahrenheitToCelsius(double Fahrenheit){
         
       
         return (Fahrenheit-32)*(5/9.0);
         
         
     }
       static void findHoursAndMinute(int number){
         
         
         int hours=(int)number/60;
         int minute=(int)number%60;
         
         System.out.println("number has "+hours+" hours");
           System.out.println("number has "+minute+" minute");
         
     }
       static void printVowels(String word){
         
         
         for(int j=0;j<word.length();j++){
             char ch=word.charAt(j);
             
             if(ch=='a' || ch=='b'|| ch=='c'||ch=='d' || ch=='e' ||
                 ch=='A'|| ch=='B' || ch=='C'|| ch=='D'|| ch=='E')
                 System.out.print(ch+" ");
             
         }
         System.out.println();
     }

    static void sameWords(String first, String last){
        
        String newWord="";
                
   String word="";
   
                
                for(int i=0;i<first.length();i++){
                    
                     char ch1=first.toLowerCase().charAt(i);
                      for(int j=0;j<last.length();j++){
                          
                          if(ch1==last.toLowerCase().charAt(j)){
                            word=word+ch1;
                           
                         
                          }
                      }
                    
                }
                
               System.out.println();
               
                
                if(!word.isEmpty()){
                    
                    char [] chars=word.toCharArray();
                    Arrays.sort(chars);
               
                 newWord +=chars[0]+",";                    
                      for(int i=1;i<chars.length;i++){
                      
                          if(chars[i]!=chars[i-1])
                            
                              newWord+=chars[i]+" ,";
                          
                          
                      }
                        
                    
                    
                    
                    
                    
                    
                }
                System.out.print(newWord);
                
                
                
                
                
        
        
        
    }
}
