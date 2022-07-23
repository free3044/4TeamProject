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
	
	

}
