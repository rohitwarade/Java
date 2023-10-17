public class minarray {
    public static void main(String[] args) {
        int[] array = {7,4,5,2,1,6,7,8};
        int ans = min(array);
        System.out.println(ans);
    }

    public static int min(int[] arr){
        int ans = arr[0];

        for(int i =0; i<arr.length;i++){
            if(ans > arr[i]){
                ans = arr[i];
            }
        } 
        return ans;
    }
}
