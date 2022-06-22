public class Q02FindMinMax {

  // method to find maximun number
  static int getMax(int[] nums, int n) {
    int max = nums[0];
     for(int i = 1; i < n; i++) {
        if(nums[i] > max) {
          max = nums[i];
        }
     }
     return max;
  }

  // method to find minimum number
  static int getMin(int[] nums, int n) {
    int min = nums[0];
    for(int i = 1; i < n; i++) {
      if(nums[i] < min) {
        min = nums[i];
      }
    }
    return min;
  }

  public static void main(String[] args) {
     int[] arr = {56, 37, 89, 32, 86, 49};
     int n = arr.length;

     System.out.println(getMax(arr, n));
     System.out.println(getMin(arr, n));
  }
}
