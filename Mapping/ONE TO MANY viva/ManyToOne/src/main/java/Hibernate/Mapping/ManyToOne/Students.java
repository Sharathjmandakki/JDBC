package Hibernate.Mapping.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Students {
	@Id
	private int Student_ID;
	private String Student_name;
	private String Date_of_Birth;
	@ManyToOne
	private Classes c;
	public Students(int student_ID, String student_name, String date_of_Birth,Classes c) {
		super();
		Student_ID = student_ID;
		Student_name = student_name;
		Date_of_Birth = date_of_Birth;
		this.c=c;
	}
	
}
