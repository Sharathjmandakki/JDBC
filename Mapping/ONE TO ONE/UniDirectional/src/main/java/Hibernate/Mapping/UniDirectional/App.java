package Hibernate.Mapping.UniDirectional;

/**
 * Hello world!
 *
 */
import org.hibernate.*;
import org.hibernate.cfg.*;
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cf=new Configuration().configure();
    	SessionFactory sf= cf.buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	//making one to one relation with person and bike with b_id 
    	//so first i am creating the bike objects then person objects
    	Bike b1=new Bike(1234,"HERO",125000);
    	Bike b2=new Bike(2233,"HONDA",150000);
    	Bike b3=new Bike(3355,"KTM",195000);
    	Person p1=new Person(11,"AJAY",26,b1);
    	Person p2=new Person(12,"MOHAN",25,b2);
    	Person p3=new Person(13,"RAKESH",29,b3);
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
