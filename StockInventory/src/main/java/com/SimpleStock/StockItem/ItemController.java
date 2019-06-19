package com.SimpleStock.StockItem;
/*
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

	@Autowired
	private ItemService itemService;
	@RequestMapping("/ItemDetails")
	public List<Item> getAllItems() {
		return itemService.getAllItems();
		
	}

}
*/


//package com.SimpleStock.StockItemQuantity;

import java.util.Arrays;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item")
	public List<Item> getAllItems() {
		return itemService.getAllItems();
		
	}

	@RequestMapping("/item/{itemId}")
	public Item getItem(@PathVariable String itemId) {
		return itemService.getItemId(itemId);
		
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/item" )
	public void addItem(@RequestBody Item item) {
		itemService.addItem(item);
		
	}
	
	
	@RequestMapping(method=RequestMethod.PUT, value="/item/{itemId}" )
	public void updateItem(@RequestBody Item item,@PathVariable String itemId) {
		itemService.updateItem(itemId, item);
		
	}

	
	@RequestMapping(method=RequestMethod.PUT, value="/item/{itemId}/{quantity}" )
	public void addItemQuantity(@PathVariable String itemId,@PathVariable int quantity)  
	{
		itemService.addItemQuantity(itemId,quantity);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/itemsub/{itemId}/{quantity}" )
	public void subItemQuantity(@PathVariable String itemId,@PathVariable int quantity)  
	{
		itemService.subtractItemQuantity(itemId,quantity);
		
	}
	
	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/item/{itemId}" )
	public void removeItem(@PathVariable String itemId) {
		itemService.deleteItem(itemId);
		
	}
	
	
}