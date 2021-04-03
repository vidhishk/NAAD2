import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args)  {
        Scanner num = new Scanner(System.in) ;
        System.out.println( "enter the number:");
        int value = num.nextInt();
        if (value%2 == 0)
        System.out.println("num is even");
        else
            System.out.println("num is odd");


    }

}
