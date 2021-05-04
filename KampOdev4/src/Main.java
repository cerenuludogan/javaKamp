

public class Main {

	public static void main(String[] args) {
		
		Customer customer =  new Customer(1,"Ceren","Uludogan",2000 ,"11112223345");
		
		CustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
	    customerManager.save(customer);
	        
		

	}

}
