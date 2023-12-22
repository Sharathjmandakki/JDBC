package Hibernate.Mapping.UniDirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	int p_id;
	String name;
	int age;
	@OneToOne
	Bike b;

	public Person(int p_id, String name, int age, Bike b) {
		super();
		this.p_id = p_id;
		this.name = name;
		this.age = age;
		this.b = b;
	}

}
