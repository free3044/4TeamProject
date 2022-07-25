package laundryroom;
/** Cloth에 대한 클래스
 * */
public  class Cloth {
	/**@param 의류클래스입니다.
	 * 아래 변수는 cloth에 대한 type(종류), weight(무게), price(가격), user(사용자)에
	 * 대한 변수를 private(캡슐화)하여 선언하였습니다.
	 * Cloth를 Overload 하여 저장되는 메소드를 만들었습니다.
	 * 출력을 위해 toString()을 만들었습니다.
	 * */
	private String type;
	private int weight;
	private int price;
	private User user;
	
	public Cloth (String type,int weight,int price ,User user) {
		/**@param 세탁물의 정보를 입력받습니다.*/
		this.type=type;
		this.weight=weight;
		this.price=price;
		this.user=user;
	}
	public String toString() {
		/**@param 세탁물의 정보를 출력합니다.*/
		return "세탁물 정보: "+type+"\n세탁물 무게: "+weight+"\n가격: "+price+"원 입니다.";
	} 
	public User getUser() {
		/**사용자 getter--*/
		return user;
		
	}
	
	public void setUser(User user) {
		/**사용자 setter--*/
		this.user = user;
		
	}
	
	public String getType() {
		/**유형 getter--*/
		return type;
		
	}
	
	public void setType(String type) {
		/**유형 setter--*/
		this.type = type;
		
	}
	
	public int getWeight() {
		/**무게 getter--*/
		return weight;
		
	}
	
	public void setWeight(int weight) {
		/**무게 setter--*/
		this.weight = weight;
		
	}
	
	public int getPrice() {
		/**가격 getter--*/
		return price;
		
	}
	
	public void setPrice(int price) {
		/**가격 setter--*/
		this.price = price;
		
	}

	
		
		
	
	
	
}
