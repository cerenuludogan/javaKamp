
public class StarbucksCustomerManager extends CustomerManager {

private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
	super();
	this.customerCheckService = customerCheckService;
}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Müþteri bulunamadý!");
		}
		
	}



	    

}
