package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import java.util.*;


public class Main {
	/*
	public static void main(String args[]){
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/bean.xml");
		Newme nm = ac.getBean("newme",Newme.class);
		nm.sayHello();
		
	}

	public static void main(String args[]){
		System.out.println( SubClass.class);
	}*/
	 
		 
		      public static void main(String[] args) {
		          List list = new ArrayList();
		          list.add("qqyumidi");
		          list.add("corn");
		          list.add(100);
		  
		          for (int i = 0; i < list.size(); i++) {
		             String name = (String) list.get(i); // 1
		             System.out.println("name:" + name);
		         }
		     }
}
	
class SuperClass{
		static {System.out.println("Super Class");}
		public static int value	=	123;
}
class SubClass extends SuperClass{
		static {System.out.println("Sub Class");}
}
