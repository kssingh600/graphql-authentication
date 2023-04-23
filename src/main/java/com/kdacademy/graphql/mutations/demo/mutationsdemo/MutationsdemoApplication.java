package com.kdacademy.graphql.mutations.demo.mutationsdemo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.kdacademy.graphql.mutations.demo.mutationsdemo.model.Product;
import com.kdacademy.graphql.mutations.demo.mutationsdemo.repository.ProductRepository;

@SpringBootApplication
public class MutationsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MutationsdemoApplication.class, args);
	}

	// For Books and their reviews
	// @Bean
	// CommandLineRunner commandLineRunner(BookRepository bookRepository){
	// 	return args -> {
	// 		Book reactiveSpring = new Book("Reactive Spring", 484, "Josh Long") ;
	// 		Review review = new Review("Great Book", "I really enjoyed this book") ;
	// 		reactiveSpring.setReviews(List.of(review));
	// 		bookRepository.save(reactiveSpring) ;
	// 	};
	// }

	// For Product
	// @Bean
	// CommandLineRunner commandLineRunner(ProductRepository repository){
	// 	return args -> {
	// 		List<Product> products = List.of(new Product("Product 1", true, 0.34F, new BigDecimal(9.99), LocalDateTime.now()), new Product("Product 2", false, 0.81F, new BigDecimal(9.99), LocalDateTime.now()), new Product("Product 3", true, 0.39f, new BigDecimal(9.99), LocalDateTime.now())) ;
	// 		repository.saveAll(products) ;
	// 		repository.findAll().forEach(System.out::println);;
	// 	};
	// }
}
