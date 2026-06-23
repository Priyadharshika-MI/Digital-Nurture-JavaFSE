public class InventoryTest {

    public static void main(
            String[] args
    ) {

        Inventory inventory =
                new Inventory();

        inventory.add(
                new Product(
                        101,
                        "Laptop",
                        20,
                        60000
                )
        );

        inventory.add(
                new Product(
                        102,
                        "Phone",
                        50,
                        25000
                )
        );

        System.out.println(
                "Inventory"
        );

        inventory.display();

        inventory.update(
                101,
                40
        );

        System.out.println();

        System.out.println(
                "After Update"
        );

        inventory.display();

        inventory.delete(
                102
        );

        System.out.println();

        System.out.println(
                "After Delete"
        );

        inventory.display();

        System.out.println();

        System.out.println(
                "Add -> O(1)"
        );

        System.out.println(
                "Update -> O(1)"
        );

        System.out.println(
                "Delete -> O(1)"
        );

    }

}