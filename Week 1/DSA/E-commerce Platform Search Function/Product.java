public class Product {
    int productId;
    String productName;
    String category;

    public Product() {
    }

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String getDetails() {
        return "Product ID: " + productId + ", Name: " + productName + ", Category: " + category;
    }
}