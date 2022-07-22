package day01;
import java.util.Scanner;

//5마이페이지 내꺼만 출력 (보류)가능하면 (내꺼인가 아닌가 내꺼면 출력 아니면 탈출?) !!
	//(6번 전 사용자 출력) //조건  //중 //내꺼만 나오게 
public class Mypage {

	public static void main(String[] args) {
		
		System.out.println("전체 회원의 정보를 보시겠습니까? [yes=1, no=2]");//=>yes or no(마이페이지로이동)
		//다른 숫자 입력시 예외처리.
		Scanner sc1=new Scanner(System.in);
		int input=sc1.nextInt(); //정수를 입력받아서 사용자가 입력한 값을 반환해준다.
		System.out.println("입력하신 값은 : "+input);
		
		if (input==1) {
			System.out.println("user class 전체 회원 정보 출력하기");
		}if (input==2) {
			System.out.println("마이페이지 불러오기, ");
		
		}else if(input!=1 || input!=2) {
			//사용자 정의 예외객체를 발생시킨다.==> throw new 예외객체();
			//예외가 발생이 되면 해당 예외를 try~catch해야 한다.
			System.out.println("yes=1, no=2로 다시 입력해주세요");
			return;
		}
		
		//Inner class 하고싶ㄷ...ㅏ......
		
		
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("회원이름을 입력하세요=> "); //=>마이페이지 출력
		String input1 =sc2.next();// string을 입력받아서 사용자가 입력한 값을 반환해준다.
		System.out.println("회원이름: "+input1);
		
		if (input1=="스폰지밥") {
			System.out.println(input1+"님의 회원정보");
		}
		//System.out.println("이소정");
		//System.out.println("이진열");
		//System.out.println("유종완");


		//Scanner sc1=new Scanner(System.in);
		//System.out.println("010-1234-5678");ed method stub

	}

}
