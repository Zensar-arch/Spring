package com.zensar.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.sevices.ProductService;

public class DbOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("dbconfig.xml");
		ProductService productService=ctx.getBean("productServiceImpl", ProductService.class);
		
		List<Product> products=productService.findAllProducts();
		System.out.println("All products are:");
		//Product product = productService.findProductById(1019);
		//if(product!=null) {
		System.out.println(products);
		
		//Product product2=new Product(1003,"Mobile","MI",13000);
		//productService.addProduct(product2);
			
		//Product product=new Product();
		
		//product.setName("Toaster");
		//product.setBrand("Bajaj");
		//product.setPrice(2000);
		//productService.updateProduct(product);
		//productService.removeProduct(product);
		
		//}
		//else {
		//	System.out.println("Product not found");
		//}
	}

}
