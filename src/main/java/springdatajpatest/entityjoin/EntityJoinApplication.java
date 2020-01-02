package springdatajpatest.entityjoin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springdatajpatest.entityjoin.service.TestForeignKeyService;

@SpringBootApplication
public class EntityJoinApplication implements CommandLineRunner {

	@Autowired
	private TestForeignKeyService service;
	
	public static void main(String[] args) {
		SpringApplication.run(EntityJoinApplication.class, args);
			
	}

	@Override
	public void run(String... args) throws Exception {
		
		service.testForeignKeyInsert();
	}
	
	

}
