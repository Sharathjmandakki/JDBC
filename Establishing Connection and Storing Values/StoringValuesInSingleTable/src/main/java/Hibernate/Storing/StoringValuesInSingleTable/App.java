package Hibernate.Storing.StoringValuesInSingleTable;

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
    	SessionFactory sf=cf.buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Person p=new Person(1,"Amit",22);
    	s.save(p);
    	t.commit();
        System.out.println( "data stored ✅" );
    }
}
