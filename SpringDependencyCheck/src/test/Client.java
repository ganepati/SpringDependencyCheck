package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;
import beans.Test;

public class Client {
	public static void main(String[] args) throws Exception {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resource/Spring.xml");
		Car c=(Car)ap.getBean("c1");
		c.printData();
		Test t=(Test)ap.getBean("t");
		t.printConnection();
		 
	}
}
