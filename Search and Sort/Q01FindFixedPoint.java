public class Q01FindFixedPoint {

  static int fixedPoint(int arr[], int n){
    // int ans[] = new int[n];
    int ans = 0;
    for(int i=0; i<n; i++) {
      if(arr[i] == i) {
         ans = i;
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    int arr[] = {-10, -5, 0, 3, 7};
    int n = arr.length;

    System.out.println(fixedPoint(arr, n));


  }
}
