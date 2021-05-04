package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer engin = new IndividualCustomer();
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		engin.customerNumber = "12345";
		hepsiBurada.customerNumber = "78910";
 
		SendikaCustomer sendikaCustomer = new SendikaCustomer();
		sendikaCustomer.customerNumber = "99999";
		
		CustomerManager customerManager = new CustomerManager();
        Customer[] customers = {engin,hepsiBurada,sendikaCustomer};
        
		customerManager.addMultiple(customers);
	}

}
