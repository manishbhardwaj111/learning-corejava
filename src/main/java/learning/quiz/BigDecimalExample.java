package learning.quiz;

import java.io.IOException;
import java.math.BigDecimal;

public class BigDecimalExample {
 
    public static void main(String args[]) throws IOException {
      
      //floating point calculation
      double amount1 = 2.155;
      double amount2 = 1.105;
      System.out.println("difference between 2.15 and 1.0 using double is: " + (amount1 - amount2));
    
      //Use BigDecimal for financial calculation
      BigDecimal amount3 = new BigDecimal("2.155");
      BigDecimal amount4 = new BigDecimal("1.105") ;
      System.out.println("difference between 2.15 and 1.0 using BigDecimal is: " + (amount3.subtract(amount4)));      
    }     
}