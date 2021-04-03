public class QuadraticEq {
    public static void main(String[] args) {
        double a = 2;
        double b=4;
        double c=2;
        double root1, root2;
        double determinent = b*b - 4*a*c   ;// determinent =b^2 - 4ac
        if (determinent>0){
            root1= ( -b+ Math.sqrt(determinent))/ 2*a;
            root2= ( -b - Math.sqrt(determinent))/ 2*a;
            System.out.format("root1= %.2f and root2=%.2f",root1,root2);
        }else if (determinent==0) {
            root1 = root2 = -b / 4 * a * c;
            System.out.format("root1 = root2= %.2f", root1);
        }else {

                double real = -b / (2 * a);
                double imaginary = Math.sqrt(-determinent) / (2 * a);
                System.out.format("root1 = %.2f+%.2fi", real, imaginary);
                System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}
