public class FindCeilingNumber {

  // What is ceiling number?
  // -> A number which is present in an array, if they not present then return the smallest max number

  static int findCeilingNumber(int[] arr, int n, int target) {
    int start = 0;
    int end = n-1;
    while(start<=end) {

      int mid = start + (end - start) / 2;

      if(arr[mid] == target) {
        return mid;
      }
      else if(arr[mid] <= target) {
        start = mid + 1;
      }
      else {
        end = mid - 1;
      }
    }
    return start;
  }

  public static void main(String[] args) {
    int[] arr = { 3, 5, 7, 10, 13, 17, 20, 30, 48};
    int n = arr.length;
    int target = 18;

    System.out.println(findCeilingNumber(arr, n, target));
  }
}
