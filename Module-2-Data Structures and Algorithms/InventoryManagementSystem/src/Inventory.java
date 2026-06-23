import java.util.HashMap;

public class Inventory {

    HashMap<Integer, Product>
            inventory =
            new HashMap<>();

    public void add(
            Product product
    ) {

        inventory.put(
                product.productId,
                product
        );

    }

    public void update(
            int id,
            int quantity
    ) {

        if (
                inventory.containsKey(
                        id
                )
        ) {

            inventory
                    .get(id)
                    .quantity =
                    quantity;

        }

    }

    public void delete(
            int id
    ) {

        inventory.remove(
                id
        );

    }

    public void display() {

        for (
                Product p :
                inventory.values()
        ) {

            p.display();

        }

    }

}