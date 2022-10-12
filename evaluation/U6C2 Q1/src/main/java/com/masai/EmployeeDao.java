package com.masai;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface EmployeeDao {

	public void addDepartment(Department dept);
	
	 public void addEmployee(Employee emp);
	 
	 public void registerEmployeeTODepartment(int empId, int deptId);
	 
	 public List<Employee> getAllEmployeeWithDeptName(int deptName);
	 
	 public Department getDepartmentDetailsByEmployeeId(int empId);
	 
}

//*********************************************************

class EmployeeDaoimpl implements EmployeeDao{

	@Override
	public void addDepartment(Department dept) {
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("mappingUnit");
		
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(dept);
		em.getTransaction().commit();
		em.close();
		System.out.println("done");
		
	}

	@Override
	public void addEmployee(Employee emp) {
		
		
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("mappingUnit");
		
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		em.close();
		System.out.println("done");
		
	}

	@Override
	public void registerEmployeeTODepartment(int empId, int deptId) {
		
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("mappingUnit");
		
		EntityManager em=factory.createEntityManager();
		
		Department department=em.find(Department.class, deptId);
		Employee employee=em.find(Employee.class, empId);
		
		employee.setDept(department);
		
		department.getEmps().add(employee);
		
		System.out.println("done");
		
	}

	@Override
	public List<Employee> getAllEmployeeWithDeptName(int deptName) {
		
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("mappingUnit");
		
		EntityManager em=factory.createEntityManager();
		
		Department department=em.find(Department.class, deptName);
		
		List<Employee> employees=department.getEmps();
		
		return employees;
	}

	@Override
	public Department getDepartmentDetailsByEmployeeId(int empId) {
		
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("mappingUnit");
		
		EntityManager em=factory.createEntityManager();
		
		Employee employee=em.find(Employee.class, empId);
		
		Department department=employee.getDept();
		
		
		return department;
	}
	
}
