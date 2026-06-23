public class StripeAdapter
implements PaymentProcessor {

    StripeGateway gateway =
            new StripeGateway();

    @Override
    public void processPayment(
            double amount
    ) {

        gateway.makePayment(
                amount
        );

    }

}