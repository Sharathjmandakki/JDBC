package Hibernate.Storing.StoringValuesInMultipaleTables;

import org.hibernate.*;
import org.hibernate.cfg.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cf=new Configuration().configure();
    	SessionFactory sf=cf.buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Person p1 = new Person(1, "Amit", 22);
		Person p2 = new Person(2, "sharath", 23);
		Person p3 = new Person(3, "Anju", 24);
		s.save(p1);
		s.save(p2);
		s.save(p3);
		Bike b1 = new Bike(101, "Hero", 85000);
		Bike b2 = new Bike(102, "BMW", 3000000);
		Bike b3 = new Bike(103, "Honda", 200000);
		s.save(b1);
		s.save(b2);
		s.save(b3);
		t.commit();
		System.out.println("Person and Bike object is added");
		System.out.println( "data stored ✅" );
    }
}
