package pl.agh.edu.pizzeriaSimulator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Pizzeria Simulator
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
 	    	   new ClassPathXmlApplicationContext(new String[] {"Spring-pizzeriaSimulator.xml"});
    	
 	    Customer customer = (Customer)context.getBean("Customer");
 	    customer.iWantPizza();
    }
}
