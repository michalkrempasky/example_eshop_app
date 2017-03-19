package model.model.data;

import java.util.*;


/**
 * @author krempi
 * @version 1.0
 * @created 15-12-2015 9:07:57
 */
public class Order {

	public int gameCounts;
	public int ID;
	public int itemCounts;
	public boolean finalized = false;
	public boolean paid = false;
	public boolean productsAssigned = false;
	public Payment payment;
	public List <Product> products;

}