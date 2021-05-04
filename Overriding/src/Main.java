
public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] baseKrediManager = new BaseKrediManager[] 
				{new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};
		for(BaseKrediManager krediManagers : baseKrediManager) {
			System.out.println(krediManagers.hesapla(1000.0));
			
		}

	}

}
