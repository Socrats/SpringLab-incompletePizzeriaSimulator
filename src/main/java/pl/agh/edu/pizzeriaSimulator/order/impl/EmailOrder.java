package pl.agh.edu.pizzeriaSimulator.order.impl;

import pl.agh.edu.pizzeriaSimulator.Pizza;
import pl.agh.edu.pizzeriaSimulator.order.IOrder;
import pl.agh.edu.pizzeriaSimulator.pizzeria.IPizzeria;

public class EmailOrder implements IOrder{
	
	IPizzeria pizzeria;
	Pizza pizza;
	
	public void order(String customerName) {
		pizza = new Pizza("By Email", customerName);
		System.out.println("Your order has been accepted, calling Pizzeria...");
		
		pizzeria.bake(pizza);	
		
		System.out.println("\n Our company has confirmed the delivery of:");
		System.out.println("Pizza " + pizza.getType() + " to " + pizza.getCustomerName() 
				+ " who made the order " + pizza.getOrderMethod() + ".");
		System.out.println("The Restaurant in charge has been " + pizza.getProducedBy() 
				+ " and the delivery company was " + pizza.getDeliveryMethod() + ".");
		
	}
	
	public void setPizzeria(IPizzeria pizzeria) {
		this.pizzeria = pizzeria;
	}

}
