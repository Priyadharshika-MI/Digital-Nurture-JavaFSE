public class AdapterTest {

    public static void main(
            String[] args
    ) {

        PaymentProcessor
                paypal =
                new PayPalAdapter();

        PaymentProcessor
                stripe =
                new StripeAdapter();

        paypal.processPayment(
                5000
        );

        stripe.processPayment(
                8000
        );

    }

}