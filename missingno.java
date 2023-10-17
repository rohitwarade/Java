import java.util.*;

public class missingno {
    public static void main(String[] args) {
        int[] array = {0,2,4,5,3};
        System.out.println(missing(array));
    }

    public static int missing(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swapp(arr,i,correct);
            }else{
                i++;
            }
        }

        for(int index = 0;index <arr.length;index++){
            if(index != arr[index]){
                return index;
            }
        }
        return arr.length;
    }

    public static void swapp(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
