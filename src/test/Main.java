package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.Newme;

public class Main {
	public static void main(String[] args){
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/bean.xml");
		Newme nm =  ac.getBean("nm",Newme.class);
		nm.Hello();
	}
}