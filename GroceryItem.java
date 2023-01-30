package agroceriesShop;

public class GroceryItem {

	private String itemName;
	private Integer quantity;
	private Integer itemId;
	private float unitPrice;
	private float qtyAmount;

	public GroceryItem(String itemName, float unitPrice, int quantity) {
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
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

}
