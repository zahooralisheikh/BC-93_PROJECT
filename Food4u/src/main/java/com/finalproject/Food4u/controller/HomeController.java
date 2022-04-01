package com.finalproject.Food4u.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.finalproject.Food4u.global.GlobalData;
import com.finalproject.Food4u.service.CategoryService;
import com.finalproject.Food4u.service.ProductService;

@Controller
public class HomeController {
   @Autowired
   public CategoryService categoryService;
   @Autowired
   public ProductService productService;
   
   @GetMapping({"/","/home"})
   public String home(Model model) {
		model.addAttribute("cartCount",GlobalData.cart.size());
	   return "index";
   }
   @GetMapping("/shop")
   public String shop(Model model) {
	   model.addAttribute("categories",categoryService.getAllCategory());
	   model.addAttribute("products",productService.getAllProduct());
		model.addAttribute("cartCount",GlobalData.cart.size());
   
	   return "shop";
   }
   @GetMapping("/shop/category/{id}")
   public String shopByCategory(Model model, @PathVariable int id) {
	   model.addAttribute("categories",categoryService.getAllCategory());
	   model.addAttribute("products",productService.getAllProductByCategory(id));
		model.addAttribute("cartCount",GlobalData.cart.size());
	   return "shop";
   }
   
   @GetMapping("/shop/viewproduct/{id}")
   public String viewProduct(Model model, @PathVariable int id) {
	  model.addAttribute("product",productService.getProductById(id).get());
		model.addAttribute("cartCount",GlobalData.cart.size());
   
	   return "viewProduct";
   }
   
   
   
}
