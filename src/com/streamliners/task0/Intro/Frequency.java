public class Frequency {

    public static void main(String[] args) {
        String str = "This is depressing but java is awesome.";
        char ch = 'i';
        int frequency = 0;

            for(int i = 0; i < str.length(); i++) {
               if(ch == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);
    }
}

