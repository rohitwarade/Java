import java.util.*;

public class tarray{
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int[][] arr = new int[i][j];
        for( i=0;i<arr.length;i++){
            for( j=0;j<arr[i].length;j++){
                arr[i][j]=in.nextInt();
                System.out.print(arr[i][j] + " ");
            }
          System.out.println();
        }
    }
}