package SolidPriciple;


class BreadMaker { 
	public void bakeBread() {
		System.out.println("Baking high-quality bread....");
	}
}

class ManageInvatory {
	public void manageInvatory() {
		System.out.println("manage the Inavatory....");
	}
}


class SupplyOrder {
	public void supplyOrder() {
		System.out.println("Suppling ordering.....");
	}
}

class CustomerSerives {
	public void customerService() {
		System.out.println("Costomer Service Support.....");
	}
}

class BakeryCleaner{
	public void cleanBakery() {
		System.out.println("Cleaning the bakery.......");
	}
}


public class SingleResponsibilityPrinciple {
	public static void main(String[] args) {
		BreadMaker baker = new BreadMaker();
		
		ManageInvatory invaotrymanager = new ManageInvatory();
		
		SupplyOrder orderSupply = new SupplyOrder();
		
		CustomerSerives technician = new CustomerSerives();
		
		BakeryCleaner cleaner = new BakeryCleaner();
		
		baker.bakeBread();
		invaotrymanager.manageInvatory();
        orderSupply.supplyOrder();
        technician.customerService();
        cleaner.cleanBakery();
        
		
		
	}
}
