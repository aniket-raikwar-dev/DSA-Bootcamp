public class Q17BuyAndSellStock {

  static int bruteForce(int arr[], int n) {
    int maxProfit = 0;
    for(int i = 0; i < n; i++) {
      int profit = 0;
      for(int j = i+1; j<n; j++) {
        if(arr[i] < arr[j]) {
          profit = arr[j] - arr[i];
          if(profit > maxProfit) {
            maxProfit = profit;
          }
        }
      }
    }
    return maxProfit;
  }

  static int optimalSol(int arr[], int n) {
    int maxProfit = 0;
    int min = arr[0];
    for(int i = 0; i < n; i++) {
      min = Math.min(min, arr[i]);
      int profit = arr[i] - min;
      maxProfit = Math.max(maxProfit, profit);
    }

    return maxProfit;
  }


  public static void main(String[] args) {
    int arr[] = {7,1,5,3,6,4};
    int n = arr.length;

    System.out.println(bruteForce(arr, n));
    System.out.println(optimalSol(arr, n));
  }
}
