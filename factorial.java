import java.util.*;

public class factorial{
    public static void main(String args[]){
        int i,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int a = sc.nextInt();
        for(i=1 ; i<=a ; i++){
            fact = fact * i;
        }
        System.out.println("The factorial of "+a+" is :- "+fact);
 
        // System.out.println("The factorial of is :-"+b);
    }
}