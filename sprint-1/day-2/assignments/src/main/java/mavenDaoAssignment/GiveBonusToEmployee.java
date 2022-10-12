package mavenDaoAssignment;

public class GiveBonusToEmployee {

	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDaoImpl();
		
		String r=dao.giveBonusToEmployee(1, 500);
		System.out.println(r);
	}
	
}
