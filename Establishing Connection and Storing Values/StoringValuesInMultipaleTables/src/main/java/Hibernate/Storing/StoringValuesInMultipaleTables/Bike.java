package Hibernate.Storing.StoringValuesInMultipaleTables;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike {
	@Id
	private int engin_no;
	private String module;
	private int cost;

	public Bike(int engin_no, String module, int cost) {
		super();
		this.engin_no = engin_no;
		this.module = module;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Bike [engin_no=" + engin_no + ", module=" + module + ", cost=" + cost + "]";
	}

}
