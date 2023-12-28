package Hibernate.Mapping.OneToManyAndManyToOne;

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
		this.Student_ID = student_ID;
		this.Student_name = student_name;
		this.Date_of_Birth = date_of_Birth;
		this.c=c;
	}	
}
