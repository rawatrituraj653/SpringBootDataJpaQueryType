package com.st.runner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.st.repo.ProductRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {

@Autowired
private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
			repo.getInfo().forEach(System.out::println);
	}
}