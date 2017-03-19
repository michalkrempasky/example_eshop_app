package model.model.managers;


import model.model.data.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author krempi
 * @version 1.0
 * @created 15-12-2015 9:08:18
 */
public class PaymentManagement {

	public PaymentManagement(){

	}

	public int loanProvider(Product product, Payment payment){
		System.out.println("Produkttova cena postacuje na zalohu");
		int price=100; //natvrdo zvolena cena
		int priceOfProduct=150; // natvrdo zvolena cena
		/** vypocita ci sa pozicka oplati, tato cast kodu len ukazuje nejake porovnanie s imaginarnymi cenami*/
		if((price-priceOfProduct)<0){
		return 1;}
		else return 0;
	}

	public void paymentCreditCard(){
		/** 
		 * Klasicka metoda na platbu kartou 
		 * */ 
		
		System.out.println("zaplat kartou cez bankove API ");
	}


	public void paymentForLoan(int value){
		/** 
		 * Metoda sluziaca na platbu pozicky, respektive splacanie pozicky
		 * */
		LoanManagement loanManagement= new LoanManagement();
		loanManagement.reduceValue(value);

	}

    public void paymentForOrder(Order order,int value){
        /**
         * Metoda sluziaca na platbu pozicky, respektive splacanie pozicky
         * */


    }

	public void paymentPaypal(){
		/** 
		 * Platba paypalom
		 * */
	}

	public void specialPayment(Order order){
			/**
			 * Tato metoda je modelovana podla UC special payment a ma aj prislusnu operaciu, sekvencny diagram
			 * 
			 * je navrhnuta len pre ukazku ako sa jednotlive akcie vykonaju 
			 * 
			 * taktiez nieje specifikovane ako si vyberiem medzi klasickym scenarom a loan provider 
			 * 
			 *  */
		
		
			OrderManagement orderManagement = new OrderManagement();
			DataManagement dataManagement = new DataManagement();
			InventoryManagement inventoryManagement= new InventoryManagement();
			LoanManagement loanManagement= new LoanManagement();

            Payment payment= new Payment();
            Product product= new Product();

            payment.Value=100;
			dataManagement.addPayment(payment,20);
			order=orderManagement.updateOrder(order);
			inventoryManagement.showProducts();

			if(1==loanProvider(product,payment)){
				loanManagement.createSpecialLoan(product);
			}
			orderManagement.statusPaid(order);
			System.out.println("Ukoncenie specialnej platby");
	}


}