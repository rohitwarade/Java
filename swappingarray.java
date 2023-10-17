import java.util.*;

public class swappingarray{
    public static void main(String args[]){
        int[] array = {1,2,3,4,5,6};
        swapp(array,0,1);
        System.out.println(Arrays.toString(array));
    }

    public static void swapp(int[] arr, int start, int target){
        int temp = arr[start];
        arr[start] = arr[target];
        arr[target] = temp;
    }
}