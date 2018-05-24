package com.shopcart.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopcart.backend.dao.ShopCartDao;
import com.shopcart.backend.dao.ShopCartDaoImpl;
import com.shopcart.backend.entities.ShopCart;

@Service
public class ShopCartBEService {

	@Autowired
	private ShopCartDao shopCartDao;
	
	public List<ShopCart> getAllShopcarts() {
		System.out.println("getAllShopcarts()");
		return shopCartDao.getAllShopcarts();
	}
	
	public List<ShopCart> addNewShopCart(ShopCart shopCart) {
		System.out.println("addNewShopCart()");
		return shopCartDao.addNewShopCart(shopCart);
	}
}
