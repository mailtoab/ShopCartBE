package com.shopcart.backend.controller;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.shopcart.backend.entities.ShopCart;
import com.shopcart.backend.service.ShopCartBEService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value="/api/toDos")
public class ShopCartController {

	@Autowired
	private ShopCartBEService shopCartBEService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, headers = "Accept=application/json")
	public List<ShopCart> createToDo(@RequestBody ShopCart shopCart){
		return shopCartBEService.addNewShopCart(shopCart);
	}
	
	@RequestMapping(value = "/tempcreate", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<ShopCart> create(){
		System.out.println("create()");
		ShopCart shopCart=new ShopCart();
		shopCart.setTask("Task1");
		shopCart.setStatus("Pending");
		return shopCartBEService.addNewShopCart(shopCart);
	}
	
//	@GetMapping(value="/toDo/{toDoId}")
//	public ToDo getToDoById(@PathVariable("toDoId")Integer toDoId){
//		return toDoBEService.getToDoById(toDoId);
//	}
	
	@RequestMapping(value = "/toDo/allToDos", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<ShopCart> getAllToDos(){
		return shopCartBEService.getAllShopcarts();
	}
//	
//	@DeleteMapping(value="/toDo/{toDoId}")
//	public void deleteToDo(@PathVariable("toDoId")Integer toDoId){
//		toDoBEService.deleteToDo(toDoId);
//	}
	
//	@PutMapping(value="/toDo/{toDoId}/{newEmail:.+}")
//	public ToDo updateToDo(@PathVariable("toDoId")Integer toDoId,@PathVariable("newEmail")String newEmail){
//		return toDoBEService.updateToDo(toDoId,newEmail);
//	}
}
