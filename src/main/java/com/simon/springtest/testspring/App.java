package com.simon.springtest.testspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/simon/springtest/testspring/beans/beans.xml");
    	
    	Patient patient1 = (Patient) context.getBean("patient");
    	Patient patient2 = (Patient) context.getBean("patient");
        
    	patient1.setName("helal");
    	patient2.setName("asd");
    	
        System.out.println( patient1);
        System.out.println( patient2);
        
    	//Address addr = (Address) context.getBean("address");
        //System.out.println( addr );
        ((ClassPathXmlApplicationContext)context).close();
    }
}
