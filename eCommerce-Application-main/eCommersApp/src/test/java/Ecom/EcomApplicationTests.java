/*
package Ecom;

import Ecom.Model.Product;
import Ecom.Model.User;
import Ecom.Repository.ProductRepository;
import Ecom.Repository.UserRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class EcomApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	ProductRepository productRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void getAllUser() {
		List<User> userList = userRepository.findAll();
		for (User user : userList) {
			System.out.println(user);
		}
	}

	@Transactional
	@Test
	public void getAllProduct() {
		List<Product> pList = productRepository.findAll();

		for (Product p : pList) {
			System.out.println(p);
		}
	}

}*/
