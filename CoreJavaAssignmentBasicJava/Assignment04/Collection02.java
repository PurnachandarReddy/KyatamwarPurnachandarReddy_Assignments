package Assignment04;

public class Collection02 {
	private String name;
	private int price;
	private String status;
	public Collection02(String name, int price, String status) {
		this.name = name;
		this.price = price;
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Collection02 [name=" + name + ", price=" + price + ", status=" + status + "]";
	}
	
	
	
	

}
