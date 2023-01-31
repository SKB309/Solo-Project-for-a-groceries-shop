package agroceriesShop;

import java.util.ArrayList;
import java.util.Date;

public class Invoice {
	
	
	private String customerName;
	private Integer phoneNumber;
	private String invoiceDate;
	private Integer numberOfItems;
	private Integer totalAmount;
	private Integer paidAmount;
	private Integer balance;
	private double total;
	private GroceryItem[] groceryItem;
	
	ArrayList<GroceryItem> items;

	public Invoice() {
		items = new ArrayList<GroceryItem>();
		total = 0.0;
	}

	public void addItem(GroceryItem item) {
		items.add(item);
		total = item.getUnitPrice() * item.getQuantity();
	}

	public void printInvoice() {
		System.out.println("Grocery Shop Invoice");
		for (GroceryItem item : items) {
			System.out.println("  Name:" + item.getItemName() + "    Price:" + item.getUnitPrice() + " O.R"
					+ "  Quantity: " + item.getQuantity());
		}
		System.out.println("  Total: " + total + " O.R");
	}

	

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public Integer getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(Integer numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public Integer getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Integer getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(Integer paidAmount) {
		this.paidAmount = paidAmount;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public void add(Invoice invoice1) {
		// TODO Auto-generated method stub

	}

	public void addProduct(Object object) {
		// TODO Auto-generated method stub

	}

	public Object getInvoiceNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public GroceryItem[] getGroceryItem() {
		return groceryItem;
	}

	public void setGroceryItem(GroceryItem[] groceryItem) {
		this.groceryItem = groceryItem;
	}

	

}
