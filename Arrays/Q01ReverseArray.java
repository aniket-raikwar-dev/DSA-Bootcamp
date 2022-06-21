public class Q01ReverseArray {

  static void reverseArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while(start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  static void printArray(int[] nums) {
    for(int i=0; i<nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};

    reverseArray(arr);
    printArray(arr);

  }
  
}
