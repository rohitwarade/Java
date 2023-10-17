import java.util.*;

public class maxarray{
    public static void main(String args[]){
        int[] array = {1,3,22,34,26,36};
        System.out.println("The maximum from this array is " );
        max(array);
    }

    public static void max(int[] arr){
        int num = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(num<arr[i]){
                num = arr[i];
            }
        }
        System.out.println(num);
    }
}