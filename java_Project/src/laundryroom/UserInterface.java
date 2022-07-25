/** UserInterface
 *  UserRegister클래스를 상속하는 부모클래스 입니다.
 *  
 *  
 * */


package laundryroom;

public interface UserInterface {
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
