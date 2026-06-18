import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(
                        101,
                        "Laptop",
                        "Electronics"),

                new Product(
                        102,
                        "Phone",
                        "Electronics"),

                new Product(
                        103,
                        "Shoes",
                        "Fashion"),

                new Product(
                        104,
                        "Watch",
                        "Accessories")

        };

        System.out.println(
                "Linear Search"
        );

        Product result1 =
                SearchAlgorithms
                        .linearSearch(
                                products,
                                "Shoes"
                        );

        if (result1 != null)
            result1.display();

        Arrays.sort(
                products,
                Comparator.comparing(
                        p -> p.productName
                )
        );

        System.out.println();

        System.out.println(
                "Binary Search"
        );

        Product result2 =
                SearchAlgorithms
                        .binarySearch(
                                products,
                                "Shoes"
                        );

        if (result2 != null)
            result2.display();

        System.out.println();

        System.out.println(
                "Time Complexity"
        );

        System.out.println(
                "Linear → O(n)"
        );

        System.out.println(
                "Binary → O(log n)"
        );

    }

}