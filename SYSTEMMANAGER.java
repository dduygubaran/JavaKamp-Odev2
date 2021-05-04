package ödevİki;

public class SystemManager {
	
	public void login(Employee employee) {
		System.out.println(employee.name+employee.surname+ " sisteme giriş yaptı. ");	
	}
	
	public void definition(Employee employee) {
		System.out.println("Çalışan kişinin mesleği tanımlanıyor: "+employee.occupation);
	}

	public void exit(Employee employee) {
		System.out.println(employee.age +" yaşındaki kişi sistemden çıktı");
	}
}
