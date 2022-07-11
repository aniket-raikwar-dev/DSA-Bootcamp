

public class Q13MergeTwoSorted {

  static void mergeTheArray(int[] arr1, int m, int[] arr2, int n) {

    int i = m-1;
    int j = n-1;
    int k = (m+n) - 1;

    while(i>=0 && j>=0) {
      if(arr1[i] > arr2[j]) {
        arr1[k] = arr1[i];
        k--;
        i--;
      }else {
        arr1[k] = arr2[j];
        k--;
        j--;
      }
    }

    while(i>=0) {
      arr1[k--] = arr1[i--];
    }

    while(j>=0) {
      arr1[k--] = arr2[j--];
    }
  }
  
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3};
    int[] arr2 = {2, 5, 6};
    int m = arr1.length;
    int n = arr2.length;
    
    mergeTheArray(arr1, m, arr2, n);
  }
}
