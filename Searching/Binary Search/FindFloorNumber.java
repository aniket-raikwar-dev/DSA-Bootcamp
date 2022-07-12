public class FindFloorNumber {
  // What is Floor Number?
  // -> a number which is a Largest No. - smaller than or equal to Target number.

  static int findFloorNumber(int[] arr, int n, int target) {
    int start = 0;
    int end = n-1;
    while(start <= end) {
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
    return end;
  }

  public static void main(String[] args) {
    int[] arr = {2, 4, 6, 8, 9, 12, 15, 19, 23, 45, 67};
    int n = arr.length;
    int target = 13;

    System.out.println(findFloorNumber(arr, n, target));
  }
}
