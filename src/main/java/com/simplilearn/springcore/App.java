package com.simplilearn.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.simplilearn.springcore.bean.Employee;
import com.simplilearn.springcore.bean.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {
    	// Creating Bean Factory IOC Container
    	/*
        Resource resource = new ClassPathResource("ApplicationContext.xml");
        BeanFactory beanfactory = new XmlBeanFactory(resource);
        
        Student student = (Student) beanfactory.getBean("studentbean") ;
        
        student.Studentdisplayinfo();*/
    	
    	// Creating Application Context IOC Container
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	
    	Student student = (Student) context.getBean("studentbean");
    	
    	Employee emp = (Employee) context.getBean("employeebean"); 
    	
    	student.Studentdisplayinfo();
    	emp.displayempinfo();
    	
    	
     
    }
}
