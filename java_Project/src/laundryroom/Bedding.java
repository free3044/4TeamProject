package laundryroom;

import java.util.Scanner;

public class Bedding extends Cloth{
	public void Laundry(String type,int clothes_kg, int price) {
		
	}
	public static void BeddingRegister() {
		Scanner sc=new Scanner(System.in);
		
		Bedding bd=new Bedding();
		System.out.println("이불의 종류를 입력하세요");
		bd.setType(sc.next());
		System.out.println("이불의 무게를 측정해 주세요");
		bd.setClothes_kg(sc.nextInt());
		bd.setPrice(3000);
		
		System.out.println("고객님의 이불은 "+bd.getType()+" 입니다.");
		System.out.println("측정하신 무게는 "+bd.getClothes_kg()+" kg입니다.");
		System.out.println("내실 금액은 "+(bd.getClothes_kg()*bd.getPrice())+"원 입니다.");
	}
			

}
