package org.neha.pack;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;
public class DrawingApp {

	public static void main(String[] args) {
		
		//Triangle triangle = new Triangle();
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle triangle = (Triangle) context.getBean("triangle");
		//When spring asks for triangle object spring will check blueprint,
		//and check for Triangle in class....and see property and fill value 
		triangle.draw();
		
		

	}

}
