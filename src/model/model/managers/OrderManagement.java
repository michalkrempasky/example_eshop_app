package model.model.managers;
import java.util.ArrayList;
import java.util.List;

import model.model.data.*;

/**
 * @author krempi
 * @version 1.0
 * @created 15-12-2015 9:08:18
 */
public class OrderManagement {

	public OrderManagement(){

	}

	public void addProduct(Order order, Product product){

		System.out.println("Produkt pridany do kosika");
        order.products.add(product);
	}

	public Order createOrder(int number){
	
		Order order= new Order();
		order.ID=(number);
		order.products = new ArrayList<Product>();
		Product product = new Product();
		System.out.println("vytvor objednavku a pridaj prvy produkt ");
		return order;
	}

	public Order finalizeOrder(Order order){
		/**
		 * sluzi na uzavretie objednavky do stavu kedy je mozne za nu platit
		 *  */
		order.finalized=true;
		return order;
	}

	public boolean statusOfAssign(Order order){
		/** 
		 * Sluzi na status pre inventory aktualizaciu 
		 * preveri objednavku aj je v stave false tak sa nepriradilo do profilu nic
		 * */ 
		
		if(order.paid && order.productsAssigned ==false ){
			System.out.println("licencie nepriradene");
			return true;
		}
		else return false;
		
	}

	public Order statusPaid(Order order){
	    order.paid=true;
		System.out.println("pozicka sa nastavila do stavu zaplatena");
	 return order;
	}

	public Order updateOrder(Order order){
		/**
		 * tato metoda sluzi len na pred platobne upravy zoznamu objednavky, v pripade ak by pouzivatel chcel
		 * zmenit obsah objednavky
		 * tato metoda ale len vypise co je v zozname mazanie nemam kedze neprogramujem GUI
		 *  */
		System.out.println("zkontroluj a vyhod zo zoznamu co nepotrebujes");
		for(Product product:order.products){
			if( product instanceof Game) {
				System.out.println(((Game) product).name);
				System.out.println(((Game) product).actualPrice);
			}
			if(product instanceof Item) {
				System.out.println(((Item) product).name);
				System.out.println(((Item) product).actualPrice);
				System.out.println(((Item) product).condition);

			}
		}
		return order;
	}
}