package controler;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		InventoryHandler inventoryHandler = new InventoryHandler();
		ShoppingHandler shoppingHandler= new ShoppingHandler();

		System.out.println("inventar (1) nakupovat(2)");
		int pom = scanner.nextInt();
		
		switch(pom){
			case 1 : {inventoryHandler.launch(scanner);
				break;
			}
			case 2 : {shoppingHandler.launch(scanner);
				break;
			}

		}
		
	}

}
