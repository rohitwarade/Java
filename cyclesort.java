import java.util.Arrays;

public class cyclesort {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        cycle(array);
        System.out.println(Arrays.toString(array));
    }

    public static void cycle(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swapp(arr,i,correct);
            }else{
                i++;
            }
        }
    }

    public static void swapp(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
