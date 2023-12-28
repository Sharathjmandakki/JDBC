package Hibernate.Mapping.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Classes {
	@Id
	private int Class_ID;
	private String Class_name;
	private int Credit_Hours;
	public Classes(int class_ID, String class_name, int credit_Hours) {
		super();
		this.Class_ID = class_ID;
		this.Class_name = class_name;
		this.Credit_Hours = credit_Hours;
	}
}
