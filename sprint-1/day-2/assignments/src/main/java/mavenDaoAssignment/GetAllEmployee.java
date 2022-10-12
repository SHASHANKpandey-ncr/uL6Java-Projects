package mavenDaoAssignment;

import java.util.List;



public class GetAllEmployee {

	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDaoImpl();
		List<Employee> employees= 
				dao.getAllEmployeeDetails();//3
		
		employees
		.forEach(e ->{ System.out.println(e);});
	}
	
}
