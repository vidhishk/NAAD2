public class SwapNumbers {
    public static void main(String[] args) {
        float num1= 45.6F;
        float num2= 35.2F;
        System.out.println("intial values are  " +num1+ " and " +num2);
        float num3 =num1;
        num1 =num2 ;
        num2= num3 ;
        System.out.println("after swap values are  " +num1+ " and " +num2);
    }
}
