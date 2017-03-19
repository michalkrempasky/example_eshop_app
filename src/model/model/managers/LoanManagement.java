package model.model.managers;

import model.model.data.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author krempi
 * @version 1.0
 * @created 15-12-2015 9:08:17
 */
public class LoanManagement {

	public LoanManagement(){

	}


    private void deployLoan(Loan loan){

    }
	/**
	 * Vytvori obycajnu penaznu pozicku
	 * */
	public int createLoan(Order order){
		System.out.println("Vytvaram pozicku vraciam sumu 150 eur napriklad");
        Loan loan = new Loan();
        loan.Value=100;
        deployLoan(loan);
		return 150;
		
	}

	/** vytvorit specialnu pozicku kde sa berie ako zaloha produkt P
	 * tato metoda vrati sumu za ktoru hodnoti produkt ako peniaze
	 * */

	public int createSpecialLoan(Product product){

		System.out.println("poskytni peniaze za produkt P ");
		Loan loan = new Loan();
		loan.Value=100;
		loan.backupProduct=product;
		deployLoan(loan);

		return 100;
	}

	/**
	 * Tato metoda sluzi na splacanie pozicky tj na odcitavanie sumy z pozicky
	 * @param moneyPaid
	 */
	public int reduceValue(int moneyPaid){

		return 0;
	}

    public int botSelling(Product product){
        List<Product> marketList= new ArrayList<Product>();

        deployProductOnMarket(product,marketList);
        /**
         * Platba predavajucim botom ktory je modelovany v selling bot use case
         * */
        return 0;
    }

    public void deployProductOnMarket(Product product, List<Product> produktList){

        produktList.add(product);
    }


}