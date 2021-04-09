import java.util.Scanner;

public class ProductClass {

    public ProductClass(String nameOfFirstProduct, int priceOfFirstProduct) {

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Name and Price of First Product : ");
        String nameOfFirstProduct = scanner.nextLine();
        int priceOfFirstProduct = scanner.nextInt();

        System.out.print("Enter the Name and Price of Second Product : ");
        String nameOfSecondProduct = scanner.next();
        int priceOfSecondProduct = scanner.nextInt();

        System.out.print("Enter the Name and Price of Third Product : ");
        String nameOfThirdProduct = scanner.next();
        int priceOfThirdProduct = scanner.nextInt();

        ProductClass productFirst = new ProductClass(nameOfFirstProduct,priceOfFirstProduct);
        ProductClass productSecond = new ProductClass(nameOfSecondProduct,priceOfSecondProduct);
        ProductClass productThird = new ProductClass(nameOfThirdProduct,priceOfThirdProduct);

        System.out.println("\n" + productFirst);
        System.out.println(productSecond);
        System.out.println(productThird);

        if(productFirst.equals(productSecond))
            System.out.println("\nProduct First and Product Second are Equal.");
        else
            System.out.println("\nProduct First and Product Second are not Equal.");
        System.out.print("\nEnter the PercentageOff : ");

        int percentageOff = scanner.nextInt();

        System.out.println(SpecialProduct.applyOffOnProduct(productFirst, percentageOff));

    }
}
