package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	//loosly - tightly coupled
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi "+ customer.getFirsName());
		
		Utils.runLoggers(loggers, customer.getFirsName());
	}
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi "+customer.getFirsName());
		Utils.runLoggers(loggers, customer.getLastName());
	}
}
