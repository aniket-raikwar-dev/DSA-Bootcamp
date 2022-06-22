import java.util.Arrays;

public class Q03FindKthSmallest {

  static int findKthSmall(int[] nums, int k) {
    
    Arrays.sort(nums);

    int smallElement = nums[k-1];

    return smallElement;
  }

  public static void main(String[] args) {
    int[] arr = {7, 10, 4, 3, 20, 15};
    int k = 3;

    System.out.println(findKthSmall(arr, k));
  }
}
