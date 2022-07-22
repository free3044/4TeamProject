package laundryroom;

public abstract class Cloth {
	private String type;
	private int weight;
	private int price;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	abstract public void Laundry (String a, int b,int c);
	
	
	
}
