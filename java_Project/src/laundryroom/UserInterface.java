package laundryroom;

public interface UserInterface {
	abstract void Account();
	abstract void Join();
	abstract void UpdateUser();
	abstract void deleteUser();
	abstract void LaundryMenu();
	abstract User findById(String id, String password);

}
