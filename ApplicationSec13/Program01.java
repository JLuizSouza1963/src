package ApplicationSec13;

import java.util.Date;

import entities.enums.OrderStatus;
import entitiesSec13.Order;

public class Program01 {

	public static void main(String[] args) {
		
		Order order = new Order(1080, null, OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os1);

	}

}
