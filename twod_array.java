import java.util.Arrays;

public class twod_array {
    public static void main(String[] args) {
        int[][] Array = {{44,22,11},{1,2},{88,33,11,44,55}};
        int[] ans = search(Array,88);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] search(int[][] arr,int target){
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
