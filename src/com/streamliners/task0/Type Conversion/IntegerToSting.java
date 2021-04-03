public class IntegerToSting {
    public static void main(String[] args){
        int num1=45;
        int num2=73;

        String str1 = String.valueOf(num1); //method 1 by using valueof method on string
        String str2 = Integer.toString(num2);// method 2 is by using integer to string

        System.out.println(str1);
        System.out.println(str2);
    }
}
