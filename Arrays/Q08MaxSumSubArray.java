public class Q08MaxSumSubArray {


  static int kadanesAlgo(int nums[], int n) {
    int maxSum = nums[0];
    int currSum = 0;
    for(int i = 0; i<n; i++) {
      currSum = currSum + nums[i];
      if(currSum > maxSum) {
        maxSum = currSum;
      }
      if(currSum < 0) {
        currSum = 0;
      }
    }
    return maxSum;
  }

  static int bruteForce(int[] nums, int n) {
    int maxSum = nums[0];
    for(int i=0; i<n; i++) {
      int currSum = 0;
      for(int j=i; j<n; j++) {
        currSum = currSum + nums[j];
        if(maxSum < currSum) {
          maxSum = currSum;
        }
      }
    }
    return maxSum;
  }

  public static void main(String args[]) {
    int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
    int n = arr.length;

    System.out.println(bruteForce(arr, n));
    System.out.println(kadanesAlgo(arr, n));
  }
}
