package Hibernate.Mapping.OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.*;

@Entity
public class Classes {
	@Id
	private int Class_ID;
	private String Class_name;
	private int Credit_Hours;
	@OneToMany
	private List<Students> l;

	public Classes(int class_ID, String class_name, int credit_Hours) {
		super();
		this.Class_ID = class_ID;
		this.Class_name = class_name;
		this.Credit_Hours = credit_Hours;
	}

	public void setS(List<Students> l) {
		this.l = l;
	}

	public List<Students> getS() {
		return l;
	}

}
