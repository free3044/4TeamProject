package laundryroom;
/** Cloth에 대한 클래스
 * */
public  class Cloth {
	/**아래 변수는 cloth에 대한 type(종류), weight(무게), price(가격), user(사용자)에
	 * 대한 변수를 private(캡슐화)하여 선언하였습니다.
	 * Cloth를 Overload 하여 저장되는 메소드를 만들었습니다.
	 * 출력을 위해 toString()을 만들었습니다.
	 * */
	private String type;
	private int weight;
	private int price;
	private User user;
	
	public Cloth (String type,int weight,int price ,User user) { /*메소드 다*/
		this.type=type;
		this.weight=weight;
		this.price=price;
		this.user=user;
	}
	public String toString() {
		return "세탁물 정보: "+type+"\n세탁물 무게: "+weight+"\n가격: "+price+"원 입니다.";
	} /**사용자 getter--*/
	public User getUser() {
		return user;
	}
	/**사용자 setter--*/
	public void setUser(User user) {
		this.user = user;
	}
	/**유형 getter--*/
	public String getType() {
		return type;
	}
	/**유형 setter--*/
	public void setType(String type) {
		this.type = type;
	}
	/**무게 getter--*/
	public int getWeight() {
		return weight;
	}
	/**무게 setter--*/
	public void setWeight(int weight) {
		this.weight = weight;
	}
	/**가격 getter--*/
	public int getPrice() {
		return price;
	}
	/**가격 setter--*/
	public void setPrice(int price) {
		this.price = price;
	}

	
		
		
	
	
	
}
