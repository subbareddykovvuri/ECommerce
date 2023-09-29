package com.fresco.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fresco.ecommerce.repo.*;
import com.fresco.ecommerce.models.*;

@Component
public class HelpController implements CommandLineRunner{
	@Autowired
	private CartProductRepo cartProductRepo;
	
	@Autowired
	private CartRepo cartRepo;
	
	@Autowired
	private CategoryRepo categoryRepo;
	
	@Autowired
	private ProductRepo productRepo;
	
	@Autowired
	private RoleRepo roleRepo;
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public void run(String... args)throws Exception{
		Category fashion=new Category("Fashion");
		Category electronics=new Category("Electronics");
		Category books=new Category("Books");
		Category groceries=new Category("Groceries");
		Category medicines=new Category("Medicines");
		
		categoryRepo.saveAll(List.of(fashion,electronics,books,groceries,medicines));		
		
	}

}
