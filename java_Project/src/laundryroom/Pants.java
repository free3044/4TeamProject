package laundryroom;

import java.util.Scanner;

/**바지를 만드는 클래스입니다. LaundryStore에있는 추상클래스에서 상속받습니다.
 * */

public class Pants extends Cloth {
	
	
	public void Laundry(String type, int clothes_kg,int price) {
		
	
	}
	public static void PantsRegister() {
		Scanner sc=new Scanner(System.in);
		
		Pants pa=new Pants();
		System.out.println("바지의 종류를 입력하세요");
		pa.setType(sc.next());
		System.out.println("바지의 무게를 측정해 주세요");
		pa.setClothes_kg(sc.nextInt());
		pa.setPrice(1000);
		
		System.out.println("고객님의 바지는 "+pa.getType()+" 종류입니다.");
		System.out.println("측정하신 무게는 "+pa.getClothes_kg()+"kg입니다.");
		System.out.println("내실 금액은 "+(pa.getClothes_kg()*pa.getPrice())+"원 입니다.");
	}
	


}
