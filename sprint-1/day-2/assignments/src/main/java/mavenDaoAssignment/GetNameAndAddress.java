package mavenDaoAssignment;

import java.util.Scanner;

public class GetNameAndAddress {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id : ");
		int x=sc.nextInt();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		Employee employee= dao.getNameAndAddress(x);//4
		System.out.println(employee.getName()+" "+employee.getAddress());
	}
}
