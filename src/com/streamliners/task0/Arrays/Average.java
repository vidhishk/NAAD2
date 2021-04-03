public class Average {
    public static void main(String[] args) {
        double[] numArray = { 35.3, 54.5, 45.6, -15.34, -23.0 };
        double sum = 0.0;
        for (double num: numArray) {
            sum += num;
        }
        double average = sum / numArray.length;
        System.out.format("The average is: %.2f", average);
    }
}
