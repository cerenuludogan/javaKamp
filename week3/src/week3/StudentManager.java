package week3;

public class StudentManager extends UserManager {

	public void addToCerficate(Student student) {
		System.out.println(student.getFirstName()+" adlı kullanıcıya sertifika verildi");
		
	}
	
	
    public void addToCourse(User user,String course) {
    	System.out.println(user.getFirstName()+ " "+ course + " kursuna kaydın yapıldı");
		
	}
}
