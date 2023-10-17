import java.util.*;

public class linearsearch{
    public static void main(String args[]){
        int[] array = {1,2,3,4,5,6};
        search(array,5);
    }

    public static int search(int[] arr,int num){
        if(arr.length==0){
            return -1;
        }

        for(int i=0; i<arr.length ; i++){
            if(arr[i]==num){
                System.out.println("Match found at index no " + i);
            }

        }
        return -1;
    }
}