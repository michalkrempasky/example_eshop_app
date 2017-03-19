package model.model.managers;

import model.model.data.*;

import java.util.List;

/**
 * @author krempi
 * @version 1.0
 * @created 15-12-2015 9:08:17
 */
public class InventoryManagement {

	public InventoryManagement(){

	}


    public void actualizationOfInventory(Inventory inventory,Order order){

        DataManagement dataManagement= new DataManagement();
        OrderManagement orderManagement = new OrderManagement();


        int pom;

        if(orderManagement.statusOfAssign(order)){
            dataManagement.requestLicence();
            for(Product product: order.products){
                pom=addActivationLicense(inventory,product);
                System.out.println(pom);
            }

        }
        System.out.println("inventar aktualizovany");

    }

	public int addActivationLicense(Inventory inventory,Product product){

		int operationSuccess=0;
        Product actual=inventory.productList.get(product.id);
        actual.license=true;
		return operationSuccess;
	}

	public int payLoan(){
		LoanManagement loanManagement = new LoanManagement();
		PaymentManagement paymentManagement= new PaymentManagement();

        int moneyPaid=150;
		paymentManagement.paymentForLoan(moneyPaid);
		loanManagement.reduceValue(moneyPaid);
		// inicializuje platenie pozicky
		return 0;
	}

	public void showLoans(Inventory inventory){
		DataManagement dataManagement= new DataManagement();
        List<Loan> loanList =null;
		loanList=dataManagement.getLoans(inventory);
		System.out.println("vypis zoznam pozicok");

	}

	public void showProducts(){
		DataManagement dataManagement= new DataManagement();
	
		dataManagement.getProducts(); // vypis zoznam produktov inventaru
	}
}