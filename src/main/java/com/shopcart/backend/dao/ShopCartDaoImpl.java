package com.shopcart.backend.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import com.shopcart.backend.entities.ShopCart;

@Repository
public class ShopCartDaoImpl implements ShopCartDao {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public List<ShopCart> getAllShopcarts() {
		System.out.println("getAllShopcarts()");
		return mongoTemplate.findAll(ShopCart.class);
	}
	
	@Override
	public List<ShopCart> addNewShopCart(ShopCart shopCart) {
		System.out.println("addNewShopCart()");
		mongoTemplate.save(shopCart);
		return getAllShopcarts();
	}

	/*@Override
	public ShopCart getUserById(String userId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(userId));
		return mongoTemplate.findOne(query, ShopCart.class);
	}

	@Override
	public ShopCart addNewShopCart(ShopCart shopCart) {
		mongoTemplate.save(shopCart);
		// Now, user object will contain the ID as well
		return user;
	}

	@Override
	public Object getAllUserSettings(String userId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(userId));
		ShopCart user = mongoTemplate.findOne(query, ShopCart.class);
		return user != null ? user.getUserSettings() : "User not found.";
	}

	@Override
	public String getUserSetting(String userId, String key) {
		Query query = new Query();
		query.fields().include("userSettings");
		query.addCriteria(
				Criteria.where("userId").is(userId).andOperator(Criteria.where("userSettings." + key).exists(true)));
		ShopCart user = mongoTemplate.findOne(query, ShopCart.class);
		return user != null ? user.getUserSettings().get(key) : "Not found.";
	}

	@Override
	public String addUserSetting(String userId, String key, String value) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(userId));
		ShopCart user = mongoTemplate.findOne(query, ShopCart.class);
		if (user != null) {
			user.getUserSettings().put(key, value);
			mongoTemplate.save(user);
			return "Key added.";
		} else {
			return "User not found.";
		}
	}*/
}