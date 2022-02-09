public class Test {

  public static void main(String[] args) {
    String a = "11";
    String b = "9";

    int len1 = a.length()-1;
    int len2 = b.length()-1;
    int carry = 0;
    String res = "";

    while (len1 >= 0 || len2 >= 0) {
      if (len1 >= 0 && len2 >= 0) {
        int result = Character.getNumericValue(a.charAt(len1--))+Character.getNumericValue(b.charAt(len2--));
        System.out.println("RESULT: " + result);
        carry = result/10;
        System.out.println(carry);
        if (result >= 10) {
          res = "" + (result-10) + res;
        }
        else {
          res = "" + (result) + res; 
        }
      }
      else if (len1 >= 0) {
        int result = Character.getNumericValue(a.charAt(len1--)) + carry;
        System.out.println("RESULT: " + result);
        carry = result/10;
        System.out.println(carry);
        if (result >= 10) {
          res = "" + (result-10) + res;
        }
        else {
          res = "" + (result) + res; 
        }
      }
      else {
        int result = Character.getNumericValue(b.charAt(len2--)) + carry;
        System.out.println("RESULT: " + result);
        carry = result/10;
        System.out.println(carry);
        if (result >= 10) {
          res = "" + (result-10) + res;
        }
        else {
          res = "" + (result) + res; 
        }
      }
    }

    System.out.println(res);
  }

}