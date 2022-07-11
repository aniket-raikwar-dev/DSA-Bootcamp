public class BinarySeachProgram {

  static int binarySearch(int arr[], int k) {
    int start = 0;
    int end = arr.length - 1;

    while(start <= end) {
      int mid = start + (end - start) / 2;

      if(k > arr[mid]) {
        start = mid + 1;
      }else if(k < arr[mid]) {
        end = mid - 1;
      }else {
        return mid;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 9, 12, 19, 20, 27, 30, 67};
    int target = 20;

    System.out.println(binarySearch(arr, target));
    
  }
}
