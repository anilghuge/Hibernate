package test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {
	
	public static void main(String[] args) {
		
		
		// student object state is transient
				Configuration cfg = new Configuration();
				cfg.configure("resource/hibernate.cfg.xml");
				SessionFactory sf = cfg.buildSessionFactory();
// 				Session s = sf.openSession();
//				s.save(st);// student object state is persistent
//				s.beginTransaction().commit();// student object will move to database
//				s.evict(st);// student object will delete/remove from persistent
//				// student object detached state
//				// then gc can collect your student object
	}

}
