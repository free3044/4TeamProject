/** User 
 * 사용자 정보에 관한 변수 값과 출력 메소드를 구현해놓은 클래스입니다.
 * ID와 비밀번호, 이름, 연락처, 주소 값을 캡슐화하여 저장하고
 * setter, getter메소드를 생성하였습니다.
 * User 클래스를 Overload 하여 데이터를 저장하는 메소드를 생성하렸습니다.
 * 출력을 위해 toString()을 만들었습니다.
 * */
package laundryroom;

public class User {

	private String id;
	private String password;
	private String name;
	private int phoneNumber;
	private String address;
	
	
	public User(String id,String password,String name, String address, int phoneNumber) {
		this.id=id;
		this.password=password;
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.address=address;
	}
	public String toString () {
		return "아이디: "+id+"\n이름 :"+name+"\n연락처: "+phoneNumber+"\n주소 :"+address;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean equals (Object id) {
		if(id instanceof User) {
			User user=(User)id;
			boolean bool=user.id.equals(id);
			return bool;
		}else return false;
	}
	
	

}
