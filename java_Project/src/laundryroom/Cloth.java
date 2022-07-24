package laundryroom;

public  class Cloth {
	private String type;
	private int weight;
	private int price;
	private User user;
	
	public Cloth (String type,int weight,int price ,User user) {
		this.type=type;
		this.weight=weight;
		this.price=price;
		this.user=user;
	}
	public String toString() {
		return "세탁물 정보: "+type+"\n세탁물 무게: "+weight+"\n가격: "+price+"원 입니다.";
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWeight() {
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

	
		
		
	
	
	
}
