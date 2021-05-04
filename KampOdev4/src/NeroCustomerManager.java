
public class NeroCustomerManager extends CustomerManager {

	private CustomerCheckService customerCheckService;
	
	public NeroCustomerManager(CustomerCheckService customerCheckService) {
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
