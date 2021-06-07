package Team;
	
public class ListItem {	
	String name;
	double price;
	int qty;
	
	public int getQty() {
		return this.qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public ListItem(String name, double price, int qty) {
		this.name = name;
		this.price = price;
		this.qty = qty;
	}

}
