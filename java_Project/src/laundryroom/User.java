package laundryroom;
import java.util.*;
public class User{
/** Scanner를 이용해서 사용자 이름을 입력하고 
 *  해당되는 사용자 정보를 출력한다
 *  
 *  
 * 
 * */
	//User[배열]
	static User[] arr =new User[10]; //배열 => DB역할
	static int count=0;//배열의 인덱스 번호로 사용할 변수
	
	public void LaundryMenu() {
		System.out.println("----------Laundry store---------");
		System.out.println("** 1. 회 원 가 입 **");
		System.out.println("** 2. 로 그 인 **");
		System.out.println("** 3. 세 탁 물 등 록 **");
		System.out.println("** 4. 가        격 **");
		System.out.println("** 5. 마 이 페 이 지 ** ");
		System.out.println("** 9. 종        료 ** ");
	}//1 회원가입(사용자정의 예외 이름에 숫자를 입력했을 경우 ,연락처에 숫자이외의 글?을넣을경우 )
	//2 로그인 //1,2 유저에서 만들고// 상 //제가
	
	//3세탁물 등록(*사용자 정의 예외 신발할꺼다 신발안됨(직원에게 상담)*) 시간날때 
	//4가격  //3,4 의류 //하 
	//진열님? 
	
	//5마이페이지 내꺼만 출력 (보류)가능하면 (내꺼인가 아닌가 내꺼면 출력 아니면 탈출?) !!
	//(6번 전 사용자 출력) //조건  //중 //내꺼만 나오게 
	
	//9종료 
	/*세탁물 일반 이불// 드라이클리닝(int ea?)
	 * -가격(키로당 가격)
	 * -최대 30명 유저 정보랑 세탁물 정보 모두 담아야한다.(마이페이지)
	 * -배열?0 리스트? 배열로 30명
	 * -사용자 정의 예외 신발? 
	 * */
	
	public static void register() {
		User u1=new User();
		//u1.inputInfo();
		System.out.println("등록한 정보");
		//u1.showInfo();
		
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
	public void printAll() {
		for(int i=0; i<count;i++) {
			User u2=arr[i];
			System.out.println("사용자 정보");
			//u2.showInfo();
		}
	}//-------------------------

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		User obj=new User();//객체 생성
		int num=0;
		do {
			//LaundryMenu 호출하기
//			User.LaundryMenu();
			num=sc.nextInt();//메뉴에 없는 번호를 입력했을 경우
			if((num<=0) || (num>4)) {
				System.out.println("메뉴에 없는 번호입니다");
				continue;
			}
			switch(num) {
			case 1: //등록===>register()메소드 호출하기
				User.register(); //static메소드(클래스 메소드)
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
