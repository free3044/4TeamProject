package laundryroom;
import java.util.*;

public class LaundryStore {
	public void showMenu() {
		System.out.println("메뉴를 선택하세요");
		System.out.println("1.로그인");
		System.out.println("2.사용자 등록");
		System.out.println("3.사용자 정보");// 3여기가 전체정보? > 4마이페이지? 회원정보 
		//전체정보 에서 아니면 마이페이지로
		//
		//
		//내정보인데 로그인을 해야 볼수있겠금 
		//
		 
		System.out.println("4.세탁물 등록");
		System.out.println("5.");//아니면 내정보로 해서 사용자정보와 세탁물정보 까지 가능?
		System.out.println("6.가져가야하는 날짜?");
		System.out.println("9.끝내기");
	} //여기수정 

	
	//옷부분에서 반복되는 코드를 없애고 한곳으로 몰수있을까?
	public static void main(String[] args) {
	
		//여기서 if문을 사용해서  돌리면 될거같습니다.
		UserRegister ur=new UserRegister();
		ur.Account(); //회원가입
		ur.Join();
		
		
		
		
		

	}

}
//
