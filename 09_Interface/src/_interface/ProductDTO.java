package _interface;

public class ProductDTO {

	String item;
	int price, qty, total;
	
	public String getItem() {
		return item;
	}
	public int getPrice() {
		return price;
	}
	public int getQty() {
		return qty;
	}
	public int getTotal() {
		return total;
	}
	
	public void setItem(String item) {
		this.item = item;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
}
