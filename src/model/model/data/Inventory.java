package model.model.data;

import java.util.List;


/**
 * @author krempi
 * @version 1.0
 * @created 15-12-2015 9:07:56
 */
public class Inventory {

	public int creation;
	public int ID;
	public boolean loanStatus;
	public boolean statusBanned;
	public String userName;
	public List<Product> productList;
	private List<Loan> loanList;

	public List<Loan> getLoanList() {
		return loanList;
	}

	public void setLoanList(List<Loan> loanList) {
		this.loanList = loanList;
	}
}