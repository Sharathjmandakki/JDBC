package Hibernate.Mapping.ManyToManyUni;

import java.util.ArrayList;

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
    	Students s1=new Students(1001,"Wayne Gentry","3-5-2005");
    	Students s2=new Students(1002,"Catiny Baker","10/2/2005");
    	Students s3=new Students(1003,"Zayan Dean","12/3/2004");
    	Students s4=new Students(1004,"Isa Mclead","4/18/2005");
    	Students s5=new Students(1005,"Jud Wilks","6/4/2005");
    	Students s6=new Students(1006,"Sally Driscoll","10/3/2004");
    	Classes c1=new Classes(101,"Introduction to Jazz",4);
    	Classes c2=new Classes(102,"Introduction to Guiter",5);
    	Classes c3=new Classes(103,"Advanced Guitar",4);
    	Classes c4=new Classes(104,"Jazz Band",4);
    	//for students to class
    	ArrayList st1=new ArrayList();
    	st1.add(s1);
    	st1.add(s2);
    	st1.add(s4);
    	ArrayList st2=new ArrayList();
    	st2.add(s1);
    	st2.add(s3);
    	ArrayList st3=new ArrayList();
    	st3.add(s3);
    	st3.add(s6);
    	ArrayList st4=new ArrayList();
    	st4.add(s4);
    	st4.add(s5);
    	c1.setS(st1);
    	c2.setS(st2);
    	c3.setS(st3);
    	c4.setS(st4);
    	s.save(s1);s.save(s2);s.save(s3);s.save(s4);s.save(s5);s.save(s6);
    	s.save(c1);s.save(c2);s.save(c3);s.save(c4);
    	t.commit();
    }
}
