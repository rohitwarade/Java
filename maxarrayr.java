import java.util.*;

public class maxarrayr{
    public static void main(String args[]){
        int[] array = {1,2,22,34,25,36,14};
        range(array,2,6);
    }

    public static int range(int[] arr,int start, int end){
        while(start<end){
            int max= Integer.MIN_VALUE;
            for(start=0;start<=end;start++){
                if(max<arr[start]){
                    max = arr[start];
                }
            }
            System.out.println(max);
        }
        return -1;
    }
}