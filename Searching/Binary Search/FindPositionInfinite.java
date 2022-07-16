public class FindPositionInfinite {

  static int binarySearch(int[] arr, int target, int start, int end) {
    while(start <= end) {
      int mid = start + (end - start) / 2;

      if(arr[mid] == target) {
        return mid;
      }else if(arr[mid] < target) {
        start = mid + 1;
      }else {
        end = mid - 1;
      }
    }
    return -1;
  }

  static int ans(int arr[], int target) {
    // first find the range 
    // first start with a box size 2
    int start = 0;
    int end = 1;

    while(target > arr[end]) {
      int temp = end + 1; // this is the New Start
      // double the box value
      // end = previous end + sizeOfBox * 2;
      end = end + (end - start + 1) * 2;
      // end = end * 2; also can used this
      start = temp;
    }
    return binarySearch(arr, target, start, end);
  }



  public static void main(String[] args) {
    int[] arr = {2, 5, 6, 12, 16, 19, 20, 23, 29, 34, 50, 51, 69, 71, 74, 78, 82, 90, 100};
    int target = 34;

    System.out.println(ans(arr, target));
  }
}