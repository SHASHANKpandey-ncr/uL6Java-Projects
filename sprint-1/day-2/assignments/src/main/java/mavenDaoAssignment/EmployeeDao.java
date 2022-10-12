package mavenDaoAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public interface EmployeeDao {
	
	
	public Employee GetEmpAddressById(int eid);
	public List<Employee> getAllEmployeeDetails();
	public Employee getNameAndAddress(int eid);
	public String giveBonusToEmployee(int empId, int bonus);

}

//**************************************************************


class DBUtil{ // method of this class will provide connection
	
	public static Connection provideConnection(){
		Connection connection=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/db1";
		
		
		try {
			connection=DriverManager.getConnection(url, "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return connection;
		
	}
	
}


//**************************************************************

class Employee{
	
	private int eid;
	private String name;
	private String address;
	private int salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "employee [eid=" + eid + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	public Employee(int eid, String name, String address, int salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	
	
}

//**************************************************************

class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public Employee GetEmpAddressById(int eid) {
		Employee employee=null;
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= 
					conn.prepareStatement("select * from employee where eid=?");
			ps.setInt(1, eid);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				
				int r= rs.getInt("eid");
				String n= rs.getString("name");
				String a= rs.getString("address");
				int m= rs.getInt("salary");
				
				
				employee=new Employee(r, n, a, m);
			
			}else
				System.out.println("Student does not exist with Roll :"+eid);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public List<Employee> getAllEmployeeDetails() {
		
		List<Employee> employees= new ArrayList<>();
		
		try(Connection conn= DBUtil.provideConnection()) {
			
		PreparedStatement ps= 
				conn.prepareStatement("select * from employee");	
			
		ResultSet rs= ps.executeQuery();
			
		while(rs.next()) {
			int r= rs.getInt("eid");
			String n= rs.getString("name");
			String a= rs.getString("address");
			int m= rs.getInt("salary");
		
			Employee student=new Employee(r, n, a, m);
			
			employees.add(student);
			
		}
		
			if(employees.size() == 0)
				System.out.println("No employee found..");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return employees;
		
	}

	@Override
	public Employee getNameAndAddress(int eid) {
		Employee employee=null;
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= 
					conn.prepareStatement("select * from employee where eid=?");
			ps.setInt(1, eid);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				
				int r= rs.getInt("eid");
				String n= rs.getString("name");
				String a= rs.getString("address");
				int m= rs.getInt("salary");
				
				
				employee=new Employee(r, n, a, m);
			
			}else
				System.out.println("Student does not exist with Roll :"+eid);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		
		String result="Bonus not added.. ";
		
		
		
		try(Connection connection=DBUtil.provideConnection()) {
			PreparedStatement ps=
					connection
					.prepareStatement("update employee set salary=salary+? where eid=?");
		
		ps.setInt(1, bonus);
		ps.setInt(2, empId);
		
		int x=ps.executeUpdate();
		if(x>0) result="bonus added.. ";
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return result;
	}




}

