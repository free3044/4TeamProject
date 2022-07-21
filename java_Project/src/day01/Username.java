package day01;
import java.util.*;

public class Username{
/** Scanner를 이용해서 사용자 이름을 입력하고 
 *  해당되는 사용자 정보를 출력한다
 *  
 *  
 * 
 * */
public class Username1 {
	//Username[배열]
	static Username1[] arr =new Username1[10]; //배열 => DB역할
	static int count=0;//배열의 인덱스 번호로 사용할 변수
	
	public static void lundaryMenu() {
		System.out.println("----------Lundary store---------");
		System.out.println("** 1. 등        록 **");
		System.out.println("** 2. 출        력 **");
		System.out.println("** 3. 세 탁 물 정 보 **");
		System.out.println("** 4. 가        격 **");
		System.out.println("메뉴 번호를 입력하세요=> ");
	}
	
	public static void register() {
		Username u1=new Username();
		u1.inputInfo();
		System.out.println("등록한 정보");
		u1.showInfo();
		
		System.out.println("입력한 사용자 정보를 저장할까요? [1. yes 2. no]");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num==1) {
			//u1을 배열에 저장함 ==> arr에 저장하기
			try {
				arr[count]=u1;
				count++;
				System.out.println("현재 등록된 인원: "+count+"명");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("[현재 인원: "+count+"명");
			}
		}
	}//-------------------------
	/**등록된 사용자정보를 출력하는 메소드*/
	public void prinAll() {
		for(int i=0; i<count;i++) {
			Username u1=arr[i];
			System.out.println("사용자 정보");
			//u1.showInfo();
		}
	}//-------------------------

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Username obj=new Username();//객체 생성
		int num=0;
		do {
			//showMenu 호출하기
			Username.lundaryMenu();
			num=sc.nextInt();//메뉴에 없는 번호를 입력했을 경우
			if((num<=0) || (num>4)) {
				System.out.println("메뉴에 없는 번호입니다");
				continue;
			}
			switch(num) {
			case 1: //등록===>register()메소드 호출하기
				Username.register(); //static메소드(클래스 메소드)
				break;
			case 2: //출력 printAll()==> arr에 저장된 사용자들의 정보를 
					//반복문 돌면서 출력
				obj.printAll();//메소드 호출 non-static메소드(인스턴스 메소드)
				//=>객체명.printAll();
				break;
			case 3: 
				break;
			case 4: 
				break;
			}
			
		}while(num!=9);
		System.out.println("끝");
		
		
		
		
		
		
	}

}
