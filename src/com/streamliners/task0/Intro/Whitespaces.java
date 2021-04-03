public class Whitespaces {

    public static void main(String[] args) {
        String sentence = "T  his i s wo  rst..";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
    }

}
