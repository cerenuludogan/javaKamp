package week3;

public class UserManager {


	public void add(User user) {
		System.out.println(user.getFirstName() + " "+ user.getLastName() +" isimli ki�i eklendi");
	}
	
	public void delete(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() +" isimli ki�i silindi");

	}
	
	public void update(User user) {
		System.out.println(user.getId()+ " " + "id'ye ait ki�i bilgieri g�ncellendi");

	}
}
