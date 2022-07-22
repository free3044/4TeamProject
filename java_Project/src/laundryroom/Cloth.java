package laundryroom;

public abstract class Cloth {
	private String type;
	private double weight;
	private int price;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double Weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	abstract public void Laundry (String a, double b,int c);
	
	
	
}
