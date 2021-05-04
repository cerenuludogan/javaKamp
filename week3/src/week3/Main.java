package week3;

public class Main {

	public static void main(String[] args) {
		Instructor instructor =new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.seteMail("enginddemirog@gmail.com");
		instructor.setInstructorTelNo("123456789");;
		instructor.setInstructorAbout("Java,C#,Python");
		
		String[] certificates=new String[] {"Java,C#"};
		Student student = new Student(2, "ceren", "uludoðan", "cerenuldgn@gmail.com", certificates);
		
		
		InstructorManager instructorManager =new InstructorManager();
        instructorManager.addToCourse(instructor);
		instructorManager.delete(instructor);
		instructorManager.showInformation(instructor);
		
		StudentManager studentManager =new StudentManager();
		studentManager.add(student);
		studentManager.addToCerficate(student);
		studentManager.addToCourse(student,"javaReact");
		
		UserManager userManager =new UserManager();
		userManager.update(instructor);

	}

}