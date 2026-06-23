public class ProxyTest {

    public static void main(
            String[] args
    ) {

        Image image =
                new ProxyImage(
                        "sample.jpg"
                );

        System.out.println(
                "First Call"
        );

        image.display();

        System.out.println();

        System.out.println(
                "Second Call"
        );

        image.display();

    }

}