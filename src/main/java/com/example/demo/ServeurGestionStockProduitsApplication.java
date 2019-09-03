package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.Repository.ProduitRepository;
import com.example.demo.Repository.RoleRepository;
import com.example.demo.Repository.UserRepository;
import com.example.demo.entity.Produit;
import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.util.RoleEnum;

@SpringBootApplication
public class ServeurGestionStockProduitsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ServeurGestionStockProduitsApplication.class, args);
		
		ProduitRepository produitRepository = ctx.getBean(ProduitRepository.class);
		
		produitRepository.save(new Produit("Livre" , 50 , 20f));
		produitRepository.save(new Produit("Cahier" , 200 , 5.25f));
		produitRepository.save(new Produit("Stylo" , 500 , 2.10f));
		
		RoleRepository roleRepository = ctx.getBean(RoleRepository.class);
		
		Role roleUser = new Role(RoleEnum.ROLE_USER);
		roleRepository.save(roleUser);
		
		Role roleAdmin = new Role(RoleEnum.ROLE_ADMIN);
		roleRepository.save(roleAdmin);
		
		UserRepository userRepository = ctx.getBean(UserRepository.class);
		
		User user = new User("user","password1",true);
		user.setRoles(Arrays.asList(roleUser));
		userRepository.save(user);
		
		User admin = new User("admin","admin",true);
		admin.setRoles(Arrays.asList(roleUser,roleAdmin));
		userRepository.save(admin);
		
	}

}
