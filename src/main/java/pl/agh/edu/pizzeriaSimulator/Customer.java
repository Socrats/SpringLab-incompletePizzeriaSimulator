package pl.agh.edu.pizzeriaSimulator;

import pl.agh.edu.pizzeriaSimulator.order.IOrder;;

public class Customer {
	String customerName;
	IOrder order;
	
	public Customer(String name) {
		this.customerName = name;
	}
	
	public void iWantPizza() {
		this.order.order(customerName);
	}
	
	public void setOrder(IOrder order) {
		this.order = order;
	}

}
