public class StrategyTest {

    public static void main(
            String[] args
    ) {

        PaymentContext card =
                new PaymentContext(
                        new CreditCardPayment()
                );

        card.executePayment(
                5000
        );

        PaymentContext paypal =
                new PaymentContext(
                        new PayPalPayment()
                );

        paypal.executePayment(
                3000
        );

    }

}