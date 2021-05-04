package week3;

public class Instructor extends User{


	private String instructorAbout;
	private String instructorTelNo;
	
	public Instructor() {
		super();
	}
	
	
	
	public Instructor(int id,String firstName,String lastName,String eMail, String instructorAbout, String instructorTelNo) {
		super(id, firstName, lastName,eMail);
		this.instructorAbout = instructorAbout;
		this.instructorTelNo = instructorTelNo;
	}



	public String getInstructorAbout() {
		return instructorAbout;
	}
	public void setInstructorAbout(String instructorAbout) {
		this.instructorAbout = instructorAbout;
	}
	public String getInstructorTelNo() {
		return instructorTelNo;
	}
	public void setInstructorTelNo(String instructorTelNo) {
		this.instructorTelNo = instructorTelNo;
	}

	
	
	
}
