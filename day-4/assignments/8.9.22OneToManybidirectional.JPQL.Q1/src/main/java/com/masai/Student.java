package com.masai;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentRoll;
	
	private String studentName;
	private String mobileNumber;
	private String email;

	@ManyToOne(cascade = CascadeType.ALL)
	private Collage colg; // use this colg variable name in mapped by
	// remove above line to make unidirectional
	
	public int getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collage getColg() {
		return colg;
	}

	public void setColg(Collage colg) {
		this.colg = colg;
	}

	@Override
	public int hashCode() {
		return Objects.hash(colg, email, mobileNumber, studentName, studentRoll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(colg, other.colg) && Objects.equals(email, other.email)
				&& Objects.equals(mobileNumber, other.mobileNumber) && Objects.equals(studentName, other.studentName)
				&& studentRoll == other.studentRoll;
	}

	@Override
	public String toString() {
		return "Student [studentRoll=" + studentRoll + ", studentName=" + studentName + ", mobileNumber=" + mobileNumber
				+ ", email=" + email + ", colg=" + colg + "]";
	}

	public Student(int studentRoll, String studentName, String mobileNumber, String email, Collage colg) {
		super();
		this.studentRoll = studentRoll;
		this.studentName = studentName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.colg = colg;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
}
