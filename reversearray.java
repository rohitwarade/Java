import java.util.*;

public class reversearray{
    public static void main(String args[]){
        int[] array = {1,2,3,4,5};
        reverse(array,0,4);
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            swapp(arr,start,end);
            start++;
            end--;
        }
    }

    public static void swapp(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}