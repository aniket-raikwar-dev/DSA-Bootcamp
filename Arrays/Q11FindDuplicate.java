import java.util.Arrays;

public class Q11FindDuplicate {


  // brute force solution 
  static int solution1(int[] arr, int n) {
     Arrays.sort(arr);
     for(int i=0; i<n-1; i++) {
      if(arr[i] == arr[i+1]) {
        return arr[i];
      }
     }
     return -1;
  }

  // linkedList Cycle Detection Algorithm
  static int floydCycle(int[] arr, int n) {
    int slow = arr[0];
    int fast = arr[0];

    do{
      slow = arr[slow];
      fast = arr[arr[fast]];
    } while(slow != fast);

    fast = arr[0];
    while(slow != fast) {
      slow = arr[slow];
      fast = arr[fast];
    }
    return slow;
  }

  public static void main(String[] args) {

    int arr[] = {1,3,4,2,2};
    int n = arr.length;

    System.out.println(solution1(arr, n));
    System.out.println(floydCycle(arr, n));
    
  }
}
