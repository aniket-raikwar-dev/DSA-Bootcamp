public class SearchInArray {

  // program to find element in an array
  static int linearSearch(int[] nums, int target) {
    int ans = -1;
    if(nums.length == 0) {  //if arr is empty return -1
      return ans;
    }

    // if not, then go through all elements
    for(int i=0; i<nums.length; i++) {
      if(nums[i] == target) {
        ans = i;
      }
    }

    return ans;
  }
  public static void main(String[] args) {
    int[] arr = {3, 6, 90, 23, 76, 45, 24};
    int target = 23;

    System.out.println(linearSearch(arr, target));


  }
}
