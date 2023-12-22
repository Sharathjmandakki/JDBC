package Hibernate.Mapping.UniDirectional;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike {
	@Id
	int b_id;
	String brand;
	int cost;

	public Bike(int b_id, String brand, int cost) {
		super();
		this.b_id = b_id;
		this.brand = brand;
		this.cost = cost;
	}
}
