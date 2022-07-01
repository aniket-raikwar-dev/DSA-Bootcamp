public class Q07CyclicRotate {

  static void cyclicRotate(int[] nums, int n) {
    int lastElement = nums[n-1];
    for(int i = n-1; i>0; i--) {
      nums[i] = nums[i-1];
    }
    nums[0] = lastElement;
  }

  static void printArray(int nums[]) {
    for(int i = 0; i<nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
  }
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5};
    int n = arr.length;

    cyclicRotate(arr, n);
    printArray(arr);


  }
}
