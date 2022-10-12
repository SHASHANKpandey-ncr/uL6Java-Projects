package com.masai;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Collage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int collageId;
	
	
	private String collageName;
	private String collageAddress;
	
	// cascade so that we need to persist only once
	// mapped by use to eliminate the use of 3rd table. recommendable.
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "colg") 
	private List<Student> studs=new ArrayList<Student>();

	public int getCollageId() {
		return collageId;
	}

	public void setCollageId(int collageId) {
		this.collageId = collageId;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	public String getCollageAddress() {
		return collageAddress;
	}

	public void setCollageAddress(String collageAddress) {
		this.collageAddress = collageAddress;
	}

	public List<Student> getStuds() {
		return studs;
	}

	public void setStuds(List<Student> studs) {
		this.studs = studs;
	}

	@Override
	public String toString() {
		return "Collage [collageId=" + collageId + ", collageName=" + collageName + ", collageAddress=" + collageAddress
				+ ", studs=" + studs + "]";
	}

	public Collage(int collageId, String collageName, String collageAddress, List<Student> studs) {
		super();
		this.collageId = collageId;
		this.collageName = collageName;
		this.collageAddress = collageAddress;
		this.studs = studs;
	}

	public Collage() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(collageAddress, collageId, collageName, studs);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Collage other = (Collage) obj;
		return Objects.equals(collageAddress, other.collageAddress) && collageId == other.collageId
				&& Objects.equals(collageName, other.collageName) && Objects.equals(studs, other.studs);
	}
	
	
}
