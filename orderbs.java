import java.util.*;

public class orderbs {

  public static void main(String args[]) {
    // int[] array = { 2, 3, 4, 5, 6, 7, 8, 9 };
    int[] array = { 22, 15, 12, 9, 8, 6, 3, 1 };
    int target = 6;
    int ans = searchbs(array, target);
    System.out.println(ans);
  }

  static int searchbs(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    boolean isAsc = arr[start] < arr[end];

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (arr[mid] == target) {
        return mid;
      }
      if (isAsc) {
        if (target < arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      } else {
        if (target > arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }
    return -1;
  }
}
