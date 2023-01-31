package agroceriesShop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;

public class Shop {

	String name;

	private static ObjectOutputStream out;
	ObjectInputStream in = null;
	FileOutputStream fops;

	private Set<String> shopName;

	public Set<String> getShopName() {
		return shopName;
	}

	public void setShopName(Set<String> shopName) {
		this.shopName = shopName;
	}

	public void setShopName(String name) {
		shopName.add(name);
		saveData();
	}

	void saveData() {
		// code to save the shop name to a database or file
		try {
			Shop shopSerialization = new Shop();
			fops = new FileOutputStream("CodeLineShop.text");
			in = new ObjectInputStream(new FileInputStream("CodeLineShop.text"));

		} catch (Exception a) {
			System.out.println("Exception from file reading block: " + a.getMessage());
		}
	}

}
