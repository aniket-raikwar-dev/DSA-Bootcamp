public class RemoveElement {

  static void removeElement(int nums[], int target) {
      int s = 0;
      int e = nums.length - 1;
      // int count = 0;

      while(s <= e) {
        if(nums[s] == target) {
          int temp = nums[e];
          nums[e] = nums[s];
          nums[s] = temp;
          e--;
        }
        if(nums[s] != target) {
          s++;
          // count = count + 1;
          // System.out.println(count);
        }
      }
  }

  static void printArray(int nums[]) {
    for(int i = 0; i < nums.length; i++){
       System.out.print(nums[i] + " ");
    }
  }
  public static void main(String[] args) {
    int arr[] = {0,1,2,2,3,0,4,2};
    int val = 2;

    printArray(arr);
    System.out.println();
    removeElement(arr, val);
    printArray(arr);


  }
}
