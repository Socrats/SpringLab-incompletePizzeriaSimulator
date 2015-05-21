package pl.agh.edu.pizzeriaSimulator.pizzeria.impl;

import pl.agh.edu.pizzeriaSimulator.Pizza;
import pl.agh.edu.pizzeriaSimulator.delivery.IDelivery;
import pl.agh.edu.pizzeriaSimulator.pizzeria.IPizzeria;

public class MexicoPizza implements IPizzeria {
	
	IDelivery delivery;
	String pizzaType;
	
	public void bake(Pizza pizza) {
		pizza.setProducedBy("Mexico Pizza");
		pizza.setType(this.pizzaType);
		System.out.println("Mexico Pizza will attend your order.");
		System.out.println("Here in Mexico pizza you will be able to taste the original Mexican Style.");
		System.out.println("Today we will prepare a pizza" + pizzaType + " in the Mexican Way for you.");
		System.out.println("The Pizza is being baked...");
		delivery.deliver(pizza);
	}
	
	public void setDelivery(IDelivery delivery) {
		this.delivery = delivery;
	}
	
	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}
	
}
