public class ObserverTest {

    public static void main(
            String[] args
    ) {

        StockMarket stock =
                new StockMarket();

        Observer mobile =
                new MobileApp();

        Observer web =
                new WebApp();

        stock.register(
                mobile
        );

        stock.register(
                web
        );

        stock.setPrice(
                5500
        );

    }

}