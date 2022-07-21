package laundryroom;

public abstract class Cloth {
	private String type;
	private int clothes_kg;
	private int price;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getClothes_kg() {
		return clothes_kg;
	}

	public void setClothes_kg(int clothes_kg) {
		this.clothes_kg = clothes_kg;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	abstract public void Laundry (String a, int b,int c);
	
	
	
}
