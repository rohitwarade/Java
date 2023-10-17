public class lssearchrange {
    public static void main(String[] args) {
        int[] Array = {1,2,3,4,5,6,7,8,9};
        int ans =search(Array,4,7,7); 
        System.out.println(ans);
    }

    public static int search(int[] arr,int start, int end,int target){
        if(arr.length==0){
            return -1;
        }

        while(start<=end){
            for(int i= start;i<=end;i++){
                if (arr[i]== target){
                    return i;
                }
            }
        }
        return -1;
    }
}
