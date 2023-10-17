import java.util.*;

public class inputarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The size of array: ");
        int n =sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter the " + i + " Element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The element of array are: ");
        for (int i=0; i<n; i++)   
        {  
        System.out.print(arr[i] +" ");  
        } 
    }
}
