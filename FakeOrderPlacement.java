public class FakeOrderPlacement {
    public boolean placeOrder() {
        CheckoutFacade checkout = new CheckoutFacade();

        String item = "Laptop-X1";
        String customer = "user_404";
        String address = "123 Main St";
        double price = 1200.00;

        boolean islegit = checkout.placeOrder(item, customer, address, price);

        // Step 4: Handle high-level outcome
        if (islegit) {
            System.out.println("Client received: Order completed successfully!");
            return true;
        } else {
            System.out.println("Client received: Order failed.");
            return false;
        }
    }    
}
