public class CapitalString {
    public static void main(String[] args) {
        String name = "jaipur";

        String firstLetter = name.substring(0, 1);
        String remainingLetters = name.substring(1, name.length());

        firstLetter = firstLetter.toUpperCase();

        name = firstLetter + remainingLetters;
        System.out.println("name: " + name);

    }
}
