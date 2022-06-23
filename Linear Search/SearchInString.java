public class SearchInString {

  static boolean search(String str, char target) {
    if(str.length() == 0) { //if string is empty return false
      return false;
    }

    // if not, then search on it using charAt(index)
    for(int i = 0; i < str.length(); i++) {
      if(str.charAt(i) == target) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    String name = "Aniket";
    char target = 'n';

    System.out.println(search(name, target));
  }
}
