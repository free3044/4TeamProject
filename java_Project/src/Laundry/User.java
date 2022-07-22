package Laundry;
import java.util.*;

public class User {
	String name;
	int phone;
	String address;
	
	public void showInfo() {
		System.out.println("이 름 : "+name);
		System.out.println("연락처 : "+phone);
		System.out.println("주 소 : "+address);
	}
	
	public void inputInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("사용자 이름 :");
		name=sc.next();
		
		System.out.println("연락처 :");
		phone=sc.nextInt();
		
		System.out.println("주 소 :");
		address=sc.next();
	}
	
}
