public class Q04Sort012 {

  static void sort012(int[] nums, int n) {
    int low = 0;
    int mid = 0;
    int high = n-1;

    while(mid <= high)  {
      if(nums[mid] == 0) {
        int temp = nums[low];
        nums[low] = nums[mid];
        nums[mid] = temp;
        low++;
        mid++;
      }

      if(nums[mid] == 1) {
        mid++;
      }

      if(nums[mid] == 2) {
        int temp = nums[high];
        nums[high] = nums[mid];
        nums[mid] = temp;
        high--;
      }
    }
  }

  static void printArray(int nums[], int n) {
    for(int i = 0; i < n; i++) {
      System.out.print(nums[i] + " ");
    }
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 0, 0, 2, 1};
    int n = arr.length;
    printArray(arr, n);
    System.out.println();
    sort012(arr, n);
    printArray(arr, n);
  }
}
