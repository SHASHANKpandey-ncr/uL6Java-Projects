package com.masai;

public class AddStudentCollage {

	public static void main(String[] args) {
		
		StudentDao dao=new StudentDaoImpl();
		
		Collage collage1=new Collage();
		collage1.setCollageName("IIT");
		collage1.setCollageAddress("Delhi");
		
		Student student1=new Student();
		student1.setStudentName("ram");
		student1.setEmail("ram@gmail.com");
		student1.setMobileNumber("9826198261");
		student1.setColg(collage1);
		
		Student student2=new Student();
		student2.setStudentName("shyam");
		student2.setEmail("shyam@gmail.com");
		student2.setMobileNumber("9827198271");
		student2.setColg(collage1);
		
		Student student3=new Student();
		student3.setStudentName("sita");
		student3.setEmail("sita@gmail.com");
		student3.setMobileNumber("1234512345");
		student3.setColg(collage1);
//		
		Student student4=new Student();
		student4.setStudentName("rita");
		student4.setEmail("rita@gmail.com");
		student4.setMobileNumber("5478954789");
		student4.setColg(collage1);
		
		collage1.getStuds().add(student1);
		collage1.getStuds().add(student2);
		collage1.getStuds().add(student3);
		collage1.getStuds().add(student4);
		
		dao.addStudentCollage(collage1);
		
		//////////////// collage 1 details ☝ 
		
		
		Collage collage2=new Collage();
		collage2.setCollageName("NIT");
		collage2.setCollageAddress("Raipur");
		
		Student student5=new Student();
		student5.setStudentName("rohit");
		student5.setEmail("rohit@gmail.com");
		student5.setMobileNumber("5612356123");
		student5.setColg(collage2);
		
		Student student6=new Student();
		student6.setStudentName("Udit");
		student6.setEmail("Udit@gmail.com");
		student6.setMobileNumber("7894578945");
		student6.setColg(collage2);
		
		Student student7=new Student();
		student7.setStudentName("rina");
		student7.setEmail("rina@gmail.com");
		student7.setMobileNumber("5698756987");
		student7.setColg(collage2);
		
		Student student8=new Student();
		student8.setStudentName("aman");
		student8.setEmail("aman@gmail.com");
		student8.setMobileNumber("5632156321");
		student8.setColg(collage2);
		
		collage2.getStuds().add(student5);
		collage2.getStuds().add(student6);
		collage2.getStuds().add(student7);
		collage2.getStuds().add(student8);
		
		dao.addStudentCollage(collage2);
		
		//////////////// collage 2 details ☝ 
		
	}
	
}
