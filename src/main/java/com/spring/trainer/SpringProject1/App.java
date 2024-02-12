package com.spring.trainer.SpringProject1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //informing the string where we have to take the configuration and create the object
    	//Activate the spring
   ClassPathXmlApplicationContext ctx =	new ClassPathXmlApplicationContext("config.xml");
   //getbean will give object
   //we want student son type casting the student down casting
   
   Student s=(Student)ctx.getBean("st");  
   System.out.println(s);
    }
}
