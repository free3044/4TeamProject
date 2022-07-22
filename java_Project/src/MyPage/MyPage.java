package MyPage;
/* 사용자 정보를 출력하는 클래스입니다.
 * 사용자 정보1= 내 정보
 * 사용자 정보2= 전체 사용자 정보
 * */
import java.util.*;
public class MyPage extends UserInfo{ 
	public void MyInfo(int name, int phone, int add) {
		
	}
	
	public static void MyInfo() { ///[1] 내정보를 먼저 불러옵니다
		Scanner sc=new Scanner(System.in);
		System.out.println("사용자의 이름을 입력해주세요");
		int input=sc.nextInt(); //정수를 입력받아서 사용자가 입력한 값을 반환해준다.
		int result=0;
		System.out.println("입력하신 값 : "+input);
			if (input==2) {
			//System.out.println("내정보: "+name + phone + address);
			//메소드 불러오기
		
		}else if(input!=2) {
			System.out.println("다시 입력해주세요");
			return;}
	}
			
			public static void EveryInfo() { ///[2] 모든 사용자의 정보를 불러옵니다
				Scanner sc=new Scanner(System.in);
				System.out.println("모든 사용자 정보를 출력할까요? [yes=1, no=2]"); //no는 그냥 종료
				int input=sc.nextInt(); //정수를 입력받아서 사용자가 입력한 값을 반환해준다.
				int result=0;
				System.out.println("입력하신 값 : "+input);
					if(input==1) {
						System.out.println("모든 사용자 정보를 불러옵니다/n"); //+모든 사용자 정보
					}
					if (input==2) {
						//메인으로 돌아가기
				}else if(input!=2) {
					System.out.println("다시 입력해주세요");
					return;
			}
		
		
		
		
		
		
	
	}//////////////////////
	
}///////////////////////	
	


