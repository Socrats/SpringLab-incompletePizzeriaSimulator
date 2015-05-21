package pl.agh.edu.pizzeriaSimulator.delivery.impl;

import pl.agh.edu.pizzeriaSimulator.Pizza;
import pl.agh.edu.pizzeriaSimulator.delivery.IDelivery;

public class HomeDelivery implements IDelivery {

	public void deliver(Pizza pizza) {
		pizza.setDeliveryMethod("Home Delivery");
		System.out.println("Your Pizza is being delivered by Home Delivery, don't worry we're really fast!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ding...Dong........Here is your Pizza " + pizza.getCustomerName() +"! Now pay!");
	}

}
