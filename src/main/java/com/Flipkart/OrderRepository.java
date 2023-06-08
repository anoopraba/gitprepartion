package com.Flipkart;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<Order, Integer> {
	@Query(value = "select flipkart.flipkart_order.city,flipkart.flipkart_product.name from flipkart.flipkart_order join flipkart.flipkart_product on flipkart.flipkart_order.order_id=flipkart.flipkart_product.order_id_fk", nativeQuery = true)
	List<Object> getOrderCity();

}
