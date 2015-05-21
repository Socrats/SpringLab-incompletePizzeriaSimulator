package pl.agh.edu.pizzeriaSimulator;

public class Pizza {
	
	private String type;
	private String producedBy;
	private String deliveryMethod;
	private String orderMethod;
	private String customerName;
	
	public Pizza(String orderMethod, String customerName) {
		this.orderMethod = orderMethod;
		this.customerName = customerName;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setProducedBy(String producedBy) {
		this.producedBy = producedBy;
	}
	
	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}
	
	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String getProducedBy() {
		return this.producedBy;
	}
	
	public String getDeliveryMethod() {
		return this.deliveryMethod;
	}
	
	public String getOrderMethod() {
		return this.orderMethod;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}

}
