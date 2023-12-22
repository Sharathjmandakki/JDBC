package Hibernate.Mapping.BiDirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bike {
	@Id
	int b_id;
	String brand;
	int cost;
	@OneToOne
	Person p;

	public Bike(int b_id, String brand, int cost,Person p) {
		super();
		this.b_id = b_id;
		this.brand = brand;
		this.cost = cost;
		this.p=p;
	}
	//remove this 
	//for this project bellow code like zero parameterized constructor and 
	//getters and setters not used 
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}

	
}
