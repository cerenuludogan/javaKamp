package week3;

public class InstructorManager extends UserManager{



	public void addToCourse(User user) {
		System.out.println("E�itime "+user.getFirstName()+" "+user.getLastName()+" e�itmen olarak atand�");

	}
	
	public void showInformation(Instructor instructor) {
		System.out.println("***************");
		System.out.println(instructor.getFirstName()+"\n"+instructor.getInstructorAbout()+"\n"+instructor.getInstructorTelNo());
		System.out.println("***************");
	}
}
