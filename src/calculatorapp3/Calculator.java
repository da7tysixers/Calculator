package calculatorapp3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Emmanuel. I am making some changes to simulate teammate changes.
 */
public class Calculator {
    
    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public int subtract(int number1, int number2) {
        return number1 - number2;
    }

    public int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public int divide(int number1, int number2) {
        return number1 / number2;
    }

    public float percent(float number1, float number2) {
        return (number1 / 100) * number2;
    }
    
    public double sin(double number) {
        return Math.sin(number);
    }
    
    public double area(double number) {
        return Math.PI * number * number;
    }
    
     public double cos(double number) {
        return Math.cos(number);
    }
     
    public double tan(double number) { 
        return Math.tan(number);
    }
      
       public double inverse(double number) {
        return 1.0 / number;
    }
       
   public double circumference(double number)   {
      return 2 * Math.PI * number;
      
   }  
    
    // implement sin, radius of a circle, sine,cosine, tan, radiuswithcircumference, inverse
    // for some functions, you don't need to numbers
}
