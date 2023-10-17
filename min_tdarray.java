import java.util.Arrays;

public class min_tdarray {
    public static void main(String[] args) {
        int[][] Array = {{44,22,11},{11,2},{88,33,11,44,55}};
        int ans = min(Array);
        System.out.println(ans);
    }

    public static int min(int[][] arr){
        int ans = arr[0][0];
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                if(arr[i][j] < ans){
                    ans = arr[i][j];
                }
            }
        }
        return ans;
    }
}
