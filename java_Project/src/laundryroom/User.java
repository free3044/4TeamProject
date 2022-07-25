package laundryroom;
/** User에 대한 클래스
 * */
public class User {
	/** @param 사용자 정보에 관한 변수 값과 출력 메소드를 구현해놓은 클래스입니다.
	 * ID와 비밀번호, 이름, 연락처, 주소 값을 캡슐화하여 저장
	 * */

	private String id;
	private String password;
	private String name;
	private int phoneNumber;
	private String address;
	
	
	public User(String id,String password,String name, String address, int phoneNumber) {
		/**@param 사용자의 정보를 입력받습니다.*/
		this.id=id;
		this.password=password;
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.address=address;
	}
	public String toString () {
		/**@param 사용자의 정보를 출력합니다.*/
		return "아이디: "+id+"\n이름 :"+name+"\n연락처: "+phoneNumber+"\n주소 :"+address;
	}
	
	
	public String getId() {
		/**@param id의 getter*/
		return id;
	}
	public void setId(String id) {
		/**@param id의 setter*/
		this.id = id;
	}
	public String getPassword() {
		/**@param password의 getter*/
		return password;
	}
	public void setPassword(String password) {
		/**@param password의 setter*/
		this.password = password;
	}
	public String getName() {
		/**@param name의 getter*/
		return name;
	}
	public void setName(String name) {
		/**@param name의 setter*/
		this.name = name;
	}
	public int getPhoneNumber() {
		/**@param phoneNumber의 getter*/
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		/**@param phoneNumber의 setter*/
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		/**@param address의 getter*/
		return address;
	}
	public void setAddress(String address) {
		/**@param address의 setter*/
		this.address = address;
	}
	public boolean equals (Object id) {
		/**@param 입력받은 값을 형변환 해주는 메소드입니다.*/
		if(id instanceof User) {
			User user=(User)id;
			boolean bool=user.id.equals(id);
			return bool;
		}else return false;
	}
	
	

}
