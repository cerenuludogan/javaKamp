package week3;

public class StudentManager extends UserManager {

	public void addToCerficate(Student student) {
		System.out.println(student.getFirstName()+" adl� kullan�c�ya sertifika verildi");
		
	}
	
	
    public void addToCourse(User user,String course) {
    	System.out.println(user.getFirstName()+ " "+ course + " kursuna kayd�n yap�ld�");
		
	}
}
