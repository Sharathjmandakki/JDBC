package Hibernate.Mapping.BiDirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cf=new Configuration().configure();
    	SessionFactory sf= cf.buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	//making one to one relation with person and bike with b_id
    	//making one to one relation with bike and person with p_id
    	//so first i am creating the person objects then bike objects because bike object
    	//Required person reference variable to store in it .viva.
    	Person p1=new Person();
    	Person p2=new Person();
    	Person p3=new Person();
    	Bike b1=new Bike(1234,"HERO",125000,p1);
    	Bike b2=new Bike(2233,"HONDA",150000,p2);
    	Bike b3=new Bike(3355,"KTM",195000,p3);
    	p1.setP_id(11);
    	p1.setAge(26);
    	p1.setName("AJAY");
    	p1.setB(b1);
    	p2.setP_id(12);
    	p2.setAge(25);
    	p2.setName("MOHAN");
    	p2.setB(b2);
    	p3.setP_id(13);
    	p3.setAge(29);
    	p3.setName("RAKESH");
    	p3.setB(b3);
    	
    	s.save(b1);
    	s.save(b2);
    	s.save(b3);
    	s.save(p1);
    	s.save(p2);
    	s.save(p3);
    	
    	t.commit();
    	System.out.println("data is stored");
    }
}
