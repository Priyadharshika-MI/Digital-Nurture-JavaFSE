public class PayPalAdapter
implements PaymentProcessor {

    PayPalGateway gateway =
            new PayPalGateway();

    @Override
    public void processPayment(
            double amount
    ) {

        gateway.sendPayment(
                amount
        );

    }

}