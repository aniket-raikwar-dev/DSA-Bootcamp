public class Q05MoveAllNegative {

  static void moveNegative(int[] nums, int n) {
     int l = 0;
     int r = n-1;

     while(l <= r) {
      if(nums[l] > 0 && nums[r] < 0) {
        l++;
        r--;
      }
      if(nums[l] < 0 && nums[r] > 0) {
        int temp = nums[r];
        nums[r] = nums[l];
        nums[l] = temp;
        l++;
        r--;
      }
      if(nums[l] < 0 && nums[r] < 0) {
        r--;
      }
      if(nums[l] > 0 && nums[r] > 0) {
        l++;
      }
     }
  }

  static void printArray(int num[], int n) {
    for(int i=0; i<n; i++) {
      System.out.print(num[i] + " ");
    }
  }


  public static void main(String[] args) {
    int[] arr =  {1, -1, 3, 2, -7, -5, 11, 6 };
    int n = arr.length;

    printArray(arr, n);
    moveNegative(arr, n);
    System.out.println();
    printArray(arr, n);
  }
}
