/**
 * 
 * @author Tim
 *
 */
import java.io.*;

public class InsufficientFundsException extends Exception //making this an extension of the exception class
{
   private double amount;

   public InsufficientFundsException(double amount)
   {
      this.amount = amount;
   } 
   public double getAmount()
   {
      return amount;
   }
}
