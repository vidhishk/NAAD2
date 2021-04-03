public class AsciiValue {
    public static void main(String[] args) {
        char ch = 'b';
        int ascii = ch;
        int castAscii = (int) ch;

           //casting is converting variable from one to another
        System.out.println("the ascii value of " +ch+ " is " +ascii);
        System.out.println("the ascii value of "+ch+ " is " +castAscii);
    }
}
