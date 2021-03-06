package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import bean.Student;

public class client {

	public static void main(String[] args) {
		Student st = new Student();
		st.setId(112);
		st.setName("abcd");
		st.setEmail("abcd@gmail.com");
		st.setMarks(500);

		// student object state is transient
		Configuration cfg = new Configuration();
		cfg.configure("resource/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		s.save(st);// student object state is persistent
		s.beginTransaction().commit();// student object will move to database
		s.evict(st);// student object will delete/remove from persistent
		// student object detached state
		// then gc can collect your student object
	}
}
