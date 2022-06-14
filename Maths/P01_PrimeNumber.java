public class P01_PrimeNumber {

  public static void main(String[] args) {

    int n = 20;
    for(int i = 1; i <= n; i++) {
       System.out.println(i + " " + isPrime(i));
    }  
  }

  static boolean isPrime (int n) {
    if(n <= 1) {    // Edge case
      return false;
    }
    int start = 2;
    while (start * start <= n) {  // (start <= n/2) is also used for better understanding
       if(n % start == 0) {
        return false;
       }
        start++;
    }
    return true;
  }
  
}
