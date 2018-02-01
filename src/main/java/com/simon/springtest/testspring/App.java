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
    	
    	Patient patient = (Patient) context.getBean("patient");
        System.out.println( patient );
        
    	//Address addr = (Address) context.getBean("address");
        //System.out.println( addr );
        ((ClassPathXmlApplicationContext)context).close();
    }
}
