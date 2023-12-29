package Hibernate.CRUD.CRUD;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	int id;
	String name;
	int age;
	String email;
	long phno;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, int age, String email, long phno) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.phno = phno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", phno=" + phno + "]";
	}

}
