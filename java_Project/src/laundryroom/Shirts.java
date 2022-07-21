package laundryroom;

import java.util.Scanner;

public class Shirts extends Cloth{
	public void Laundry(String type,int clothes_kg,int price) {
		
	}
	public static void ShirtsRegister() {
		Scanner sc=new Scanner(System.in);
		
		Shirts sh=new Shirts();
		System.out.println("셔츠의 종류를 입력하세요");
		sh.setType(sc.next());
		System.out.println("셔츠의 무게를 측정해 주세요");
		sh.setClothes_kg(sc.nextInt());
		sh.setPrice(1500);
		
		System.out.println("고객님의 셔츠은 "+sh.getType()+" 입니다.");
		System.out.println("측정하신 무게는 "+sh.getClothes_kg()+" kg입니다.");
		System.out.println("내실 금액은 "+(sh.getClothes_kg()*sh.getPrice())+"원 입니다.");
	}

}
