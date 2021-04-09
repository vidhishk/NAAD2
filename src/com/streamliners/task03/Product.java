public class Product {String name;
    int price;
    public Product(){
    }

    public Product(String name,int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Name : %s @ Rs. %d ",name,price);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }
        if(!(obj instanceof Product)){
            return false;
        }
        Product product = (Product) obj;
        return name.equals(product.name) && Integer.compare(price,product.price)==0;
    }

}
