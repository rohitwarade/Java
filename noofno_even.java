// Find no. of no. having even number of digits
// 1.Count the number of digits 
// 2. Check if even or not 
// 3. return total count


public class noofno_even {
    public static void main(String[] args) {
        int[] array = {22,1,3,4444,567};
        int ans = check(array);
        System.out.println(ans);
    }

    public static int check(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length;i++){
            if(isEven(arr[i])){
                count++;
            }
        }
        return count;
    }

    public static boolean isEven(int num){
        int numberofdigits = digits(num);
        return numberofdigits % 2 == 0;
    }

    public static int digits(int num){
    int counter = 0;

        while(num>0){
            counter++;
            num=num/10;
        }
        return counter;
    }
}


