import java.util.Scanner;

public class Modify {
    public static String modify(String s, String replace) {
        char ch[] = s.toCharArray();
        char ch1[] = replace.toCharArray();
        {
            for (int i = 0; i < replace.length(); i = i + 2) {
                for (int j = 0; j < s.length(); j++) {
                    if (ch1[i] == ch[j]) {
                        ch1[i + 1] = ch[j];
                    }
                }
            }
            String str = String.valueOf(ch);
            return str;
        }
    }
  public static void main(String[] args){
      Scanner scan= new Scanner(System.in);
      System.out.println("enter th string");
            String s=scan.next();
      System.out.println("enter the replacement string");
       String replacement=scan.next();
       String result=modify(s,replacement);
      System.out.println("new string is"+result);
        }


}
