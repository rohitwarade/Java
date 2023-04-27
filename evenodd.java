import java.util.*;

public class evenodd{
    public static void main(String arrgs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :- ");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("Yes it is even");
        }
        else{
            System.out.println("It is odd");
        }
    }
}