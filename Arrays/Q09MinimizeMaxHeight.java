import java.util.Arrays;

public class Q09MinimizeMaxHeight {

  static int getMinHeightDiff(int arr[], int n, int k) {
     Arrays.sort(arr);
     int ans = arr[n-1] - arr[0];

     int smallest = arr[0] + k;
     int largest = arr[n-1] - k;
     int ma, mi;

     for(int i = 0; i < n-1; i++) {
       mi = Math.min(smallest, arr[i+1]-k);
       ma = Math.max(largest, arr[i]+k);
       if(mi < 0) {
        continue;
       }

       ans = Math.min(ans, ma-mi);
     }

     return ans;
  }

  public static void main(String[] args) {
    int arr[] = {1, 5, 8, 10};
    int n = arr.length;
    int k = 2;

    System.out.println(getMinHeightDiff(arr, n, k));


  }
  
}
