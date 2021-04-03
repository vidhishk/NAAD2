public class Equals {
    public static void main(String[] args) {
        String name1 = new String("Ladhak");
        String name2 = "Ladhak";
        System.out.println("check if two strings are equal");//IT TELLS US ABOUT REFERENCE
              boolean result1 = (name1 == name2);
              System.out.println("Using == operator: " + result1); //IT IS ABOUT ACTUAL VALUE
              boolean result2 = name1.equals(name2);
             System.out.println("Using equals(): " + result2);
    }
}
