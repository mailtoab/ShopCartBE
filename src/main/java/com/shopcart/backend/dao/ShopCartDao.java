package com.shopcart.backend.dao;
import java.util.List;
import com.shopcart.backend.entities.ShopCart;

public interface ShopCartDao {

	List<ShopCart> getAllShopcarts();

	List<ShopCart> addNewShopCart(ShopCart shopCart);

	/*ShopCart addNewUser(ShopCart user);

	Object getAllUserSettings(String userId);

	String getUserSetting(String userId, String key);

	String addUserSetting(String userId, String key, String value);*/
}