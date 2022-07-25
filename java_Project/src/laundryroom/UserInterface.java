package laundryroom;
/** UserInterface 인터페이스입니다.
 * */
public interface UserInterface {
	/** @serial 사용하게될 메소드를 선언했습니다. UserRegister클래스를 상속하는 부모클래스 입니다.
	 * */
	
	abstract void Account();
	abstract void Join();
	abstract void UpdateUser();
	abstract void deleteUser();
	abstract void LaundryMenu();
	abstract void Mypage();
	abstract void EveryInfo();
	abstract void Logout();
	abstract User findById(String id, String password);

}
