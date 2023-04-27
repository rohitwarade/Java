import java.util.*;

public class calculator{
    public static void main(String args[]){
        int c,fact;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:- ");
        int a = sc.nextInt();
        System.out.println("Enter second number:- ");
        int b = sc.nextInt();
        System.out.println("Enter operator +, -, *, /, % ");
        char operator = sc.next().charAt(0);

        switch(operator)
        {
            case'+':
            c = a + b;
            System.out.println("The Sum of "+a+" and "+b+" is :- "+c);
            break;
            case'-':
            c = a - b;
            System.out.println("The Subtraction of "+a+" and "+b+" is :- "+c);
            break;
            case'*':
            c = a * b;
            System.out.println("The Multiplication of "+a+" and "+b+" is :- "+c);
            break;
            case'/':
            c = a / b;
            System.out.println("The Division of "+a+" and "+b+" is :- "+c);
            break;
            case'%':
            c = a % b;
            System.out.println("The Modulus of "+a+" and "+b+" is :- "+c);
            break;
            default:
            System.out.println("Invalid Operator");
            break;
        }
    }
}