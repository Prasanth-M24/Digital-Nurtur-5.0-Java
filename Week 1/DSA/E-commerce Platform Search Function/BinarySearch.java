import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {

    public static Product binarySearch(Product[] products, int targetId){
        int left = 0;
        int right = products.length -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(products[mid].productId == targetId){
                return products[mid];
            }
            if(products[mid].productId < targetId){
                left = mid + 1;
            } else {
                right = mid - 1;
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


        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        int targetId = 104;

        long startTime = System.nanoTime();
        Product foundProduct = binarySearch(products, targetId);
        long endTime = System.nanoTime();

        if (foundProduct != null) {
            System.out.println("Product found: " + foundProduct.getDetails());
        } else {
            System.out.println("Product not found.");
        }

        System.out.println("Time taken for binary search: " + (endTime - startTime) + " nanoseconds");
    }
}
