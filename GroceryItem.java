package agroceriesShop;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class GroceryItem {

	
	private static String itemName;
	private Integer quantity;
	private Integer itemId;
	private float unitPrice;
	private float qtyAmount;
	Invoice[] invoice;

	
	 
 public Invoice[] getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice[] invoice) {
		this.invoice = invoice;
	}

	public void setQtyAmount(float qtyAmount) {
		this.qtyAmount = qtyAmount;
	}

public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public float getQtyAmount() {
		return qtyAmount;
	}

	public void setQtyAmount(Integer qtyAmount) {
		this.qtyAmount = qtyAmount;
	}

	public Object getInvoiceNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCustomerName() {
		// TODO Auto-generated method stub
		return null;
	}

}
