package model.model.managers;

import model.model.data.Game;
import model.model.data.Item;
import model.model.data.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author krempi
 * @version 1.0
 * @created 15-12-2015 9:08:18
 */
public class SearchManagement {

	public SearchManagement(){

	}

	
	public void intermediateSearch(){
		/**
		 * tento vyhladavac ma sluzit na presnejsie a detailnejsie vyhladavanie produktov
		 *  */ 
	}

	public int priceGathering(Product product){

		return 0;
	}

	public List<Game> searchGames(String condition){

        List<Game> gameList=new ArrayList<Game>();
        Game fakeprod = new Game();
        gameList.add(fakeprod);
        return gameList;
	}

	public List<Item> searchItems(String condition){

        List<Item> itemList=new ArrayList<Item>();
        Item fakeprod = new Item();
        itemList.add(fakeprod);
        return itemList;
	}

	public List<Product> searchProducts(String condition){

		List<Product> productList=new ArrayList<Product>();
		Product fakeprod = new Product();
		productList.add(fakeprod);
		return productList;
	}
}