package com.stock.stockitem;

import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, String> {
	
	

}
