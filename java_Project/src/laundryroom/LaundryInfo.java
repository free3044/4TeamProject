package laundryroom;
import java.util.*;
/** 사용자가 맡길 세탁물을 등록하는 클래스 입니다.
 * 
 */
public class LaundryInfo extends Cloth {
	public void Laundry(String type, double weight, int price) {
		
	}
	public static void LaundryMenu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("----메뉴를 선택하세요----");
		System.out.println("1. 표준 세탁\n2. 드라이클리닝\n3. 이불 세탁");
		int num=sc.nextInt();
		
		LaundryInfo li=new LaundryInfo();
		
		System.out.println("세탁물의 무게를 입력해주세요");
		int num2=sc.nextInt();//double쓰면 안됌.. 금액 책정이 어려워짐
		li.setWeight(num2);
		int result=0;
		
		switch(num) {
		case 1:
			result = 1000 * num2;
			
			break;
		case 2:
			result = 5000 * num2;
			
			break;
		case 3:
			result = 3000 * num2;
			
			break;
		default:
			System.out.println("없는 메뉴입니다!!");//메뉴선택에서 잘못 입력했을 경우 무게입력이 먼저 뜨는데
												//이게 먼저뜨게 할려면 어떻게 해야 할까요?
			return;
		}
		System.out.println(num+"번 메뉴\n"+num2+"Kg\n"+"가격은 "+result+"원");
		System.out.println("등록이 완료되었습니다.");

			
	}
	
	public static void StandardRegister() {
		Scanner sc=new Scanner(System.in);
		
		LaundryInfo li=new LaundryInfo();//LaundryInfo의 변수 li
		System.out.println("--표준 세탁--");
		System.out.println();
		li.setType(sc.next());
		System.out.println("세탁물의 무게를 입력해주세요");
		li.setWeight(sc.nextDouble());
		li.setPrice(1000);
		System.out.println("등록이 완료되었습니다.");
	}
	
	public static void DryRegister() {
		Scanner sc=new Scanner(System.in);
		LaundryInfo li=new LaundryInfo();//LaundryInfo의 변수 li
		System.out.println("--드라이 클리닝--");
		li.setType(sc.next());
		System.out.println("갯수를 입력해주세요");
		li.setWeight(sc.nextDouble());
		li.setPrice(5000);
		System.out.println("등록이 완료되었습니다.");

	}
	
	public static void BeddingRegister() {
		Scanner sc=new Scanner(System.in);
		LaundryInfo li=new LaundryInfo();//LaundryInfo의 변수 li
		System.out.println("--이불 세탁--");
		li.setType(sc.next());
		System.out.println("세탁물의 무게를 입력해주세요");
		li.setWeight(sc.nextDouble());
		li.setPrice(3000);
		System.out.println("등록이 완료되었습니다.");

	}

}
