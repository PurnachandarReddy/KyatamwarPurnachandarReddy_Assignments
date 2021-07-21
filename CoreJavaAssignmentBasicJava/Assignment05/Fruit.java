package Assignment05;

public class Fruit {
	private String name;
	private int calories;
	private int price;
	private String colour;
	
	
	public Fruit(String name, int calories, int price, String colour) {
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.colour = colour;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCalories() {
		return calories;
	}


	public void setCalories(int calories) {
		this.calories = calories;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	@Override
	public String toString() {
		return "Fruit [name=" + name + ", calories=" + calories + ", price=" + price + ", colour=" + colour + "]";
	}
	
	
	
	

}
