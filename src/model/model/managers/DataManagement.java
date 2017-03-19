package model.model.managers;

import java.util.ArrayList;
import java.util.List;

import model.model.data.*;



/**
 * @author krempi
 * @version 1.0
 * @created 15-12-2015 9:08:17
 */
public class DataManagement {

	public DataManagement(){

	}

	public int addPayment(Payment payment,int value){

		payment.Value=value;
		int id= 55; // vzgeneruje ID podla databazy
		
		return id;
	}

	public List<Loan> getLoans(Inventory inventory){
		List<Loan> loans=inventory.getLoanList();
		System.out.println("Zoznam poziciek");
		return loans;
	}


	public void getProducts(){

		System.out.println("Zoznam produktov");
	}

	public void requestLicence(){
		System.out.println("Licencie na produkty");
		
	}
}