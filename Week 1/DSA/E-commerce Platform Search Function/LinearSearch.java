public class LinearSearch {
    public static Product linearSearch(Product[] products, int productId) {
        for (Product product : products) {
            if (product.productId == productId) {
                return product;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(102, "Laptop", "Electronics"),
            new Product(105, "Smartphone", "Electronics"),
            new Product(103, "Tablet", "Electronics"),
            new Product(115, "Sofa", "Furniture"),
            new Product(112, "Dining Table", "Furniture"),
            new Product(104, "Camera", "Electronics")
        };

        int targetId = 104;

        long startTime = System.nanoTime();
        Product foundProduct = linearSearch(products, targetId);
        long endTime = System.nanoTime();

        if (foundProduct != null) {
            System.out.println("Product found: " + foundProduct.getDetails());
        } else {
            System.out.println("Product not found.");
        }

        System.out.println("Time taken for linear search: " + (endTime - startTime) + " nanoseconds");
    }
}
