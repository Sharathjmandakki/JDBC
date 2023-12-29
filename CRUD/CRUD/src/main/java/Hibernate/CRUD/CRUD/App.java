package Hibernate.CRUD.CRUD;

/**
 * Hello world!
 *
 */
import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.query.NativeQuery;

public class App {
	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		SessionFactory sf = cf.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
//    	create(s);
//    	display(s);
//    	update(s);
		try {
		delete(s);
		display(s);
		t.commit();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void create(Session s) {
		Person p1 = new Person(11, "amit", 22, "amit@123", 693852741L);
		s.save(p1);
		Person p2 = new Person(12, "amit1", 23, "amit@1234", 6989952741L);
		s.save(p2);
	}

	public static void display(Session s) {
		Person p = s.get(Person.class, 11);
		System.out.println(p.toString());
	}

	public static void update(Session s) {
		Person p = s.get(Person.class, 11);
		p.setName("Sharath");
		p.setEmail("sharath@123.com");
		s.save(p);
	}

	public static void delete(Session s) throws Exception {
			Person p = s.get(Person.class, 12);
			s.delete(p);
		
	}
}
