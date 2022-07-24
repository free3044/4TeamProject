package laundryroom;
import java.util.*;

public class LaundryStore {
	
	public static void showMenu() {
		System.out.println("------메뉴를 선택하세요------");
		System.out.println("--------1.회원가입--------");
		System.out.println("--------2.로 그 인--------");
		System.out.println("-------3.세탁물 등록-------"); 
		System.out.println("-------4.마이 페이지-------");
		System.out.println("----5.회원정보 수정, 삭제----");
		System.out.println("----6.모든 회원 정보 출력----");
		System.out.println("------7.로 그 아 웃-------");
		System.out.println("-------9.종    료--------");
	}

	
	//옷부분에서 반복되는 코드를 없애고 한곳으로 몰수있을까?
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		UserRegister ur=new UserRegister();
		int num=0;
		do {
			LaundryStore.showMenu();
			num=sc.nextInt();
			switch(num) {
			case 1:
				ur.Account();
				break;
			case 2:
				ur.Join();
				break;
			case 3:
				ur.LaundryMenu();
				break;
			case 4:
				ur.Mypage();
				break;
			case 5:
				System.out.println("회원정보 수정 및 삭제 입니다. \n 1.수정   2.삭제");
				int num2=sc.nextInt();
				if (num2==1) {
					ur.UpdateUser();
					break;
				}else if (num2==2) {
					ur.deleteUser();
					break;
				}else System.out.println("초기로 돌아갑니다.");
					break;
			case 6:
				ur.EveryInfo();
				break;
			case 7:
				ur.Logout();
				break;
			}
		}while(num!=9);
		
		

	}

}
//
