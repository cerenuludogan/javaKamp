package week3;

public class UserManager {


	public void add(User user) {
		System.out.println(user.getFirstName() + " "+ user.getLastName() +" isimli kiþi eklendi");
	}
	
	public void delete(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() +" isimli kiþi silindi");

	}
	
	public void update(User user) {
		System.out.println(user.getId()+ " " + "id'ye ait kiþi bilgieri güncellendi");

	}
}
