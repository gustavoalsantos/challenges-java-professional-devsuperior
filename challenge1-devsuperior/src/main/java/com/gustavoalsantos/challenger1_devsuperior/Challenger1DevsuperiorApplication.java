package com.gustavoalsantos.challenger1_devsuperior;

import com.gustavoalsantos.challenger1_devsuperior.entities.Order;
import com.gustavoalsantos.challenger1_devsuperior.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class Challenger1DevsuperiorApplication implements CommandLineRunner {

	private OrderService orderService;

	public Challenger1DevsuperiorApplication(OrderService orderService) {
		this.orderService = orderService;
	}


	public static void main(String[] args) {

		SpringApplication.run(Challenger1DevsuperiorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("ENTRADA (dados do pedido: código, valor básico porcentagem de desconto)");

		int idOrder = sc.nextInt();

		double orderBasic = sc.nextDouble();

		double orderDiscount = sc.nextDouble();


		Order order = new Order(idOrder, orderBasic, orderDiscount);

		double Total = orderService.total(order);

		System.out.println("Pedido código " +
							order.getIdOrder() +
							"\nValor total: R$ " +
							String.format("%.2f", Total));

		sc.close();
	}
}
