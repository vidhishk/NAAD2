public class Power {
    public static void main(String[] args) {
        int base = 4, exponent=3 ;
        long result = 1;
        for (;exponent != 0; --exponent) {
            result *= base; }
        System.out.println("Answer = " + result);


    }
}
