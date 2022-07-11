public class Q12KadaneAlgorithm {

  static int kadaneAlgorithm(int[] arr, int n) {
    int maxSum = arr[0];
    int currSum = 0;

    for(int i = 0; i < n; i++) {
      currSum += arr[i];
      if(currSum > maxSum) {
        maxSum = currSum;
      }
      if(currSum < 0) {
        currSum = 0;
      }
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int[] arr = { 1,2,3,-2,5 };
    int n = arr.length;
    
    System.out.println(kadaneAlgorithm(arr, n));

  }
}
