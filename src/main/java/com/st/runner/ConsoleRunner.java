package com.st.runner;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.st.entity.Product;
import com.st.repo.ProductRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {

@Autowired
private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
		/*
		 * repo.getInfo().forEach(System.out::println);
		 * repo.getCostOnly().forEach(s->System.out.println("Cost only: "+s));
		 * repo.getData().forEach(s->System.out.println(s[0]+"......"+s[1]));
		 * repo.getNewData(101,6.5).forEach(System.out::println);
		 * repo.getNamedData("Spring", "database").forEach(System.out::println);
		 * repo.withoutPack().forEach(System.out::println);
		 */		
		/*
		 * int update=repo.getUpdate(12.5, 111);
		 * System.out.println(update+": row is updated");
		 */
		/*
		 * int update =repo.remove(111); System.err.println(update);
		 */
		
		Optional<Product> p=repo.getOneRecds1(106);
		if (p.isPresent()) {
			Product p1=p.get();
			System.err.println(p1.getProdName()+"\t"+p1.getProdModel());
		} else {
			System.err.println("DATA IS Found........");
		}
		
	
			
	}
}