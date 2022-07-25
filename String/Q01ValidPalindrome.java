public class Q01ValidPalindrome {

  static boolean isValidPalindrome(String str) {

    String s = "";

    for (char c : str.toCharArray()) {
      if (Character.isDigit(c) || Character.isLetter(c)) {
        s = s + c;
      }
    }

    s = s.toLowerCase();

    int start = 0;
    int end = s.length() - 1;

    while (start <= end) {
      if (s.charAt(start) != s.charAt(end)) {
        return false;
      }
      start++;
      end--;
    }

    return true;

  }

  public static void main(String[] args) {
    String str = "apurvr, u pa!";

    System.out.println(isValidPalindrome(str));

  }
}
