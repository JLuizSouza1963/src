package entitiesSec13;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	private Double subTotal;
	
	private OrderItem() {
	}

	public OrderItem(Integer quantity, Double price, Double subTotal) {
		this.quantity = quantity;
		this.price = price;
		this.subTotal = subTotal;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	/*public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}*/

	public double subTotal() {
		return price * quantity;
	}
	
	public String toString() {
		return quantity + ", " +price + ", " + subTotal();
	}
	
}
