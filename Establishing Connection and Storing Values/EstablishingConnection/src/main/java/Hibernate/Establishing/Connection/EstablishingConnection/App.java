package Hibernate.Establishing.Connection.EstablishingConnection;

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
    	Configuration cf=new Configuration();
    	//creating the object of configuration using zero parameterized constructor
    	cf.configure();
    	//calling the configure method using the reference variable
    	SessionFactory sf=cf.buildSessionFactory();
    	System.out.println("connection is established");
    }
}
