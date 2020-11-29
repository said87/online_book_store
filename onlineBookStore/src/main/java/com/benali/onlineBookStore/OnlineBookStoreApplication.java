package com.benali.onlineBookStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineBookStoreApplication /*implements CommandLineRunner*/ {

	public static void main(String[] args) {
		SpringApplication.run(OnlineBookStoreApplication.class, args);
	}

//	@Autowired
//	private BookRespository bookRepo;
//	
//	@Autowired
//	private CategoryRepository categoryRepo;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		
//		categoryRepo.save(new Category(null, "Programmation", null));
//		categoryRepo.save(new Category(null, "Reseaux Telecom", null));
//		categoryRepo.save(new Category(null, "Securite informatique", null));
//		
//		Category c1 = categoryRepo.findAllById(1L);
//		Category c2 = categoryRepo.findAllById(2L);
//		Category c3 = categoryRepo.findAllById(3L);
//		
//		bookRepo.save(new Book(null, "sku1", "Apprendre à programmer en java", "java 8", 40, null, true, 50, new Date(), new Date(), c1));
//		bookRepo.save(new Book(null, "sku2", "lean PHP", "PHP for beginners", 20, null, true, 70, new Date(), new Date(), c1));
//		bookRepo.save(new Book(null, "sku3", "C# for dummies", "c# from zero to hero", 30, null, true, 60, new Date(), new Date(), c1));
//		bookRepo.save(new Book(null, "sku4", "secure your SI", "security", 20, null, true, 50, new Date(), new Date(), c3));
//		bookRepo.save(new Book(null, "sku5", "improve you SI security", "cybersecurity", 90, null, true, 20, new Date(), new Date(), c3));
//		bookRepo.save(new Book(null, "sku6", "master your network", "network", 40, null, true, 50, new Date(), new Date(), c2));
//		bookRepo.save(new Book(null, "sku7", "optimize your netword", "network", 75, null, true, 65, new Date(), new Date(), c2));
//	}

}
