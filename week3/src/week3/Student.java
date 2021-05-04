package week3;

public class Student extends User {

private String[] certificates;
	
	public Student() {
		super();
	}
	
	public Student(int id, String firstName, String lastName, String eMail, String[] certificates) {
		super(id, firstName, lastName, eMail);
		this.certificates = certificates;
	}


	public String[] getCertificates() {
		return certificates;
	}

	public void setCertificates(String[] certificates) {
		this.certificates = certificates;
	}
}
