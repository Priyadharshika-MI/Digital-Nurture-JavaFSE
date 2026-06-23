public class SortingTest {

    public static void main(
            String[] args
    ) {

        Order[] orders = {

                new Order(
                        1,
                        "Priya",
                        5000
                ),

                new Order(
                        2,
                        "John",
                        2000
                ),

                new Order(
                        3,
                        "David",
                        8000
                )

        };

        System.out.println(
                "Bubble Sort"
        );

        OrderSorter
                .bubbleSort(
                        orders
                );

        for (
                Order o :
                orders
        ) {

            o.display();

        }

        System.out.println();

        Order[] quick = {

                new Order(
                        1,
                        "Priya",
                        5000
                ),

                new Order(
                        2,
                        "John",
                        2000
                ),

                new Order(
                        3,
                        "David",
                        8000
                )

        };

        System.out.println(
                "Quick Sort"
        );

        OrderSorter
                .quickSort(
                        quick,
                        0,
                        quick.length - 1
                );

        for (
                Order o :
                quick
        ) {

            o.display();

        }

        System.out.println();

        System.out.println(
                "Bubble -> O(n²)"
        );

        System.out.println(
                "Quick -> O(n log n)"
        );

    }

}