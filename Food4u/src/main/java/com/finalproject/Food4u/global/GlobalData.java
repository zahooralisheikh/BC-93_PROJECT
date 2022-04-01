package com.finalproject.Food4u.global;

import java.util.ArrayList;
import java.util.List;

import com.finalproject.Food4u.model.Product;

public class GlobalData {
	
	public static List<Product> cart;
	static {
		cart = new ArrayList<Product>();
	}

}
