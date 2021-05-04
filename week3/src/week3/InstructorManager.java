package week3;

public class InstructorManager extends UserManager{



	public void addToCourse(User user) {
		System.out.println("Eðitime "+user.getFirstName()+" "+user.getLastName()+" eðitmen olarak atandý");

	}
	
	public void showInformation(Instructor instructor) {
		System.out.println("***************");
		System.out.println(instructor.getFirstName()+"\n"+instructor.getInstructorAbout()+"\n"+instructor.getInstructorTelNo());
		System.out.println("***************");
	}
}
