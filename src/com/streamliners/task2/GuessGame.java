import java.util.Scanner;

public class GuessGame {
    public static boolean startGame(String S) {
    Scanner scanner = new Scanner(System.in);
    int count = 0;
    StringBuilder stringBuilder = new StringBuilder();
    StringBuilder stringBuilder1 = new StringBuilder(S);

    for(int i = 0; i < S.length(); i++) {
        if((int)S.charAt(i) != 45 && (int)S.charAt(i) != 71&& (int)S.charAt(i) != 7 && (int)S.charAt(i) != 19 && (int)S.charAt(i) != 85) {
            count++;
            stringBuilder.append("_");
        }
        else
            stringBuilder.append(S.charAt(i));
    }

    System.out.print("\n" + stringBuilder1 + "\n");

    int chances = count + 3;
    int j = 0;
    String alphabet;
    boolean condition = false;

    while(chances--!=0) {

        System.out.print("\nWord : " + stringBuilder + "\n");
        System.out.print("Chances : " + (chances + 1) + "\n");
        System.out.print("Guess a Consonant Alphabet except the Vowels : ");
        alphabet = scanner.next().toUpperCase();

        for(int i = 0; i < S.length(); i++) {
            if(alphabet.charAt(0) == S.charAt(i)) {
                j++;
                stringBuilder.setCharAt(i,alphabet.charAt(0));
            }
        }

        if(j > 0) {
            System.out.print("Guess Alphabet " + alphabet + " found " + j + " time(s)!\n");
        }
        else
            System.out.print("Sorry!\nGuess Alphabet not found!\n");

        j = 0;

        if(stringBuilder.toString().equals(stringBuilder1.toString())) {
            condition = true;
            break;
        }

    }

    return condition;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Word as a String : ");
        String str = scanner.next().toUpperCase();
        if(startGame(str))
            System.out.print("\nCongratulations\nYou win!\n");
        else
            System.out.print("\nSorry\nyou lose!\n");
    }

}

