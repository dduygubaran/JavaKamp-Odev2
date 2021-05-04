package ödevİki;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee1 = new Employee("Duygu"," Baran",25,"Mühendis");
		Employee employee2 = new Employee("Uraz"," Aksoy",32,"Doktor");
		
		Employee[] employees = {employee1,employee2};
		System.out.println("Eleman sayısı: "+employees.length);
		System.out.println("------------------------------------------------");
		
		SystemManager systemManager = new SystemManager();
		systemManager.login(employee1);
		systemManager.definition(employee1);
		systemManager.exit(employee1);
		System.out.println("------------------------------------------------");
		systemManager.login(employee2);
		systemManager.definition(employee2);
		systemManager.exit(employee2);
		
	}

}
