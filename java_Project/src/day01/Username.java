package day01;
import java.util.*;
/** Scanner를 이용해서 사용자 이름을 입력하고 
 *  해당되는 사용자 정보를 출력한다
 * 
 * */
public class Username {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("사용자 이름을 입력하세요=> ");
		
		String name=sc.next();
		System.out.println(name);
		System.out.println("이소정");
		System.out.println("이진열");
		System.out.println("유종완");
		
		System.out.println("--------------------------------");
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("010-1234-5678");
		
	}

}
