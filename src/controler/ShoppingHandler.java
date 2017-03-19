package controler;

import model.model.data.Order;
import model.model.data.Product;
import model.model.managers.OrderManagement;
import model.model.managers.PaymentManagement;
import model.model.managers.SearchManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ShoppingHandler {

    void launch(Scanner scanner){

        OrderManagement orderManagement = new OrderManagement();
        SearchManagement searchManagement = new SearchManagement();
        PaymentManagement paymentManagement = new PaymentManagement();

        List<Product> productList=searchManagement.searchProducts("ID 55");
        searchManagement.searchGames("BIOSHOCK");
        searchManagement.searchItems("AWP");

        Order order =orderManagement.createOrder(10);

        orderManagement.addProduct(order,productList.get(0));

        paymentManagement.paymentCreditCard();

    }
}
