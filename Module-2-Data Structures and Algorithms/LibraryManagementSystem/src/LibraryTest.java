import java.util.Arrays;
import java.util.Comparator;

public class LibraryTest {

    public static void main(
            String[] args
    ) {

        Book[] books = {

                new Book(
                        101,
                        "Java",
                        "James"
                ),

                new Book(
                        102,
                        "Python",
                        "Guido"
                ),

                new Book(
                        103,
                        "C Programming",
                        "Dennis"
                ),

                new Book(
                        104,
                        "Data Structures",
                        "Mark"
                )

        };

        System.out.println(
                "Linear Search"
        );

        Book result1 =
                LibrarySearch
                        .linearSearch(
                                books,
                                "Python"
                        );

        if (
                result1 != null
        ) {

            result1.display();

        }

        Arrays.sort(
                books,

                Comparator.comparing(
                        b -> b.title
                )

        );

        System.out.println();

        System.out.println(
                "Binary Search"
        );

        Book result2 =
                LibrarySearch
                        .binarySearch(
                                books,
                                "Python"
                        );

        if (
                result2 != null
        ) {

            result2.display();

        }

        System.out.println();

        System.out.println(
                "Linear -> O(n)"
        );

        System.out.println(
                "Binary -> O(log n)"
        );

    }

}