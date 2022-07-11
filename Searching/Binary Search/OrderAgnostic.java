public class OrderAgnostic {
  // if array is sorted but we don't know whether it is in ascending order or decreasing,
  // then we apply order agnostic method

  static int orderAgnostic(int[] arr, int target) {
     int s = 0;
     int e = arr.length - 1;

     while(s <= e) {
      int mid = s + (e-s) / 2;

      if(arr[mid] == target) {
        return mid;
      }

      if(arr[s] < arr[e]) {
        if(target > arr[mid]) {
          s = mid + 1;
        }else {
          e = mid - 1;
        }
      }else {
        if(target > arr[mid]) {
          e = mid - 1; 
        }else {
          s = mid + 1;
        }
      }
     }
     return -1;
  }

  public static void main(String[] args) {
    int arr1[] = { 2, 4, 6, 9 ,10, 23, 26, 29, 34, 47, 56, 78, 90};
    int arr2[] = { 80, 78, 69, 51, 49, 43, 35, 31, 29, 12, 7};
    int target = 29;

    System.out.println(orderAgnostic(arr1, target));
    System.out.println(orderAgnostic(arr2, target));
  }
  
}
