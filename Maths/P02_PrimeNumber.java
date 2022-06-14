public class P02_PrimeNumber {

  static boolean isPrime(int n) {
    if(n <= 1) {
      return false;
    }
    int count = 1;
    for(int i = 2; i <= n; i++) {
      if(n % i == 0) {
        count = count + 1;
        if(count > 2) {
          return false;
        }
      }
    }
    count = 1;
    return true;
  }

  
  public static void main(String[] args) {
     int n = 1;
     if(isPrime(n)) {
      System.out.println(n + " is Prime Number");
     }
     else {
      System.out.println(n + " is Not Prime Number");
     }
  }
  
}
