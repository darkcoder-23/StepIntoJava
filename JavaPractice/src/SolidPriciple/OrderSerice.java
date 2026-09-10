package SolidPriciple;

public class OrderSerice {
	public void createOrder() {
		System.out.println("Creating the Order");
	}
	
	public void processPayment() {
		System.out.println("Payment process for the order");
	}
	
	public void sendSms() {
		System.out.println("Send Send of the Order");
	}
	
	public void generateInvoice() {
		System.out.println("Invoice generated");
	}

}

// This is not follow the single responsibility principle.

