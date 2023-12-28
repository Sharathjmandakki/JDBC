package Hibernate.Mapping.OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {
	@Id
	private int Student_ID;
	private String Student_name;
	private String Date_of_Birth;
	public Students(int student_ID, String student_name, String date_of_Birth) {
		super();
		this.Student_ID = student_ID;
		this.Student_name = student_name;
		this.Date_of_Birth = date_of_Birth;
	}	
}
