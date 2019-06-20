package com.stock.stockitem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ItemService { 	

	@Autowired
	private ItemRepository itemRepository;
	
	public List<Item> getAllItems(){
		//return items;
		List<Item> items = new ArrayList<>();
		itemRepository.findAll()
		.forEach(items::add); 
			return items;
		
	}

	public Item getItemId(String itemId) {
		return itemRepository.findOne(itemId);
	
	}

	public void addItem(Item item) {
		//items.add(item);
		itemRepository.save(item);
	}
	
	//Update item details
	
	public void updateItem(String itemId,Item item) {
		
		itemRepository.save(item);
	}
	
	public void deleteItem(String itemId) {
		//items.removeIf(t -> t.getitemId().equals(itemId));
		itemRepository.delete(itemId);
	}
	
	
public void addItemQuantity(String itemId,int quantity) 
{
			int q,total;
			
			Item item=itemRepository.findOne(itemId);
			
			q = item.getQuantity() + quantity;
			
			item.setQuantity(q);
			//q= item.getQuantity();
			
			//total= itemRepository.findOne(itemId).getQuantity()+q;
			
			//itemRepository.findOne(itemId).setQuantity(total);
			
			
		itemRepository.save(item);
	
}

public void subtractItemQuantity(String itemId,int quantity) 
{
			int q,total;
			
			Item item=itemRepository.findOne(itemId);
			if (item.getQuantity() >= quantity ) {
			q = item.getQuantity() - quantity;
			
			item.setQuantity(q);
			}
			
		itemRepository.save(item);
	
}
}

