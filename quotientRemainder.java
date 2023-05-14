import java.util.*;

public class quotientRemainder {

    public static void main(String[] args) {
  
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a dividend :- ");
      int dividend = sc.nextInt();
      System.out.println("Enter a divisor :- ");
      int divisor = sc.nextInt();
  
      int quotient = dividend / divisor;
      int remainder = dividend % divisor;
  
      System.out.println("Quotient = " + quotient);
      System.out.println("Remainder = " + remainder);
    }
  }