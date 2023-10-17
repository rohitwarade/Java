import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] array= {5,3,2,4,1};
        selection(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selection(int[] arr){
        for(int i =0; i<arr.length;i++){
            int last = arr.length - i - 1;
            int maxIndex = getMax(arr,0,last); 
            swapp(arr,maxIndex,last);
        }
    }

    public static void swapp(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int getMax(int[] arr,int start,int end){
        int max = start;
        for(int i =start;i<=end;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
}
