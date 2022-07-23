package laundryroom;
import java.util.*;
public class UserRegister implements UserInterface {
	//1] 회원가입 시스템 
	//1-1] 회원가입1 전체내용저장 2 아이디 비번으로 로그인을 해야함 
	//2] 배열 등록 (텍스트로 저장할수있을까?)
	//3] 로그인 시스템 쌍으로 등록해야한다 비밀번호 까지 등록
	//4] 로그인 한 다음 개인정도 출력??
	
	int count=0;
	List<User> userList=new ArrayList<>();
	List<Cloth> clothList=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	User login=null;
	@Override
	public void Account() {
		
		System.out.println("ID를 입력하십시오=>");
		String id=sc.next();
		System.out.println("비밀번호를 입력 하십시오=>");
		String password=sc.next();
		System.out.println("이름을 입력 하십시오=>");
		String name=sc.next();
		System.out.println("연락처을 입력 하십시오=>");
		int phoneNumber=sc.nextInt();
		System.out.println("주소을 입력 하십시오=>");
		String address=sc.next();
		User user=new User(id,password,name,address,phoneNumber);
		userList.add(user);
		System.out.println(name+"님 회원이 되신것을 축하합니다.");
		System.out.println(userList.size()+"번째 회원입니다.");
		return;
	}
	@Override
	public void Join() {
		boolean bl=false; 
		boolean bl2=false; 
		while(!(bl==true && bl2==true)) {
			System.out.println("Id를 입력해 주세요=>");
			String id=sc.next();
			System.out.println("비밀번호를 입력해 주세요=>");
			String password=sc.next();
			for (int i=0;i<userList.size();i++) {
				
				bl=userList.get(i).getId().equals(id);
				bl2=userList.get(i).getPassword().equals(password);
				
				if (bl==false) {
					System.out.println("존재하지 않거나 틀린 ID입니다.");
				}else if(bl2==false) {
					System.out.println("비밀번호가 틀렸습니다.");
				}
				else if(bl && bl2) {
					 login=findById(id,password);
				 System.out.println(userList.get(i).getName()+"님");
				}
			}
		}System.out.println("환영합니다."); //마이페이지 갈수있겠금==>
		
		
	}
	@Override
	public void UpdateUser() {
		System.out.println("회원 정보 변경 입니다.");
		int num=0;
		do {
			System.out.println("다시 로그인 해주십시오.\n되돌아 가시려면 9번을 누르세요");
			System.out.println("Id를 입력하세요");
			String id=sc.next();
			System.out.println("비밀번호를 입력하세요");
			String password=sc.next();
			if (findById(id,password)==null) {
				System.out.println("아이디또는 비밀번호를를 틀리셨습니다.");
			}else
				System.out.println("변경하시려는 항목을 선택하세요");
				System.out.println("1.비밀번호 변경 2.주소변경 3.연락처변경");
			num=sc.nextInt();
			if(num==1) {
				System.out.println("비밀번호 변경입니다.");
				System.out.println("변경하시려는 비밀번호를 입력하세요");
				password=sc.next();
				findById(id,password).setPassword(password);
				break;
			}else if(num==2) {
				System.out.println("주소 변경입니다.");
				System.out.println("변경하시려는 주소를 입력하세요");
				String address=sc.next();
				findById(id,password).setAddress(address);
				break;
			}else if(num==3) {
				System.out.println("연락처 변경입니다.");
				System.out.println("변경하시려는 연락처를 입력하세요");
				int phoneNumber=sc.nextInt();
				findById(id,password).setPhoneNumber(phoneNumber);
				break;
			}else System.out.println("다시입력해 주세요.");
		}while(num!=9);
		System.out.println("변경이 완료되었습니다!!");
		
	}
	@Override
	public void deleteUser() {
		int num=0;
		System.out.println("회원 정보 삭제입니다.");
		do {
			System.out.println("다시 로그인 해주십시오.\n되돌아 가시려면 9번을 누르세요");
			System.out.println("Id를 입력하세요");
			String id=sc.next();
			System.out.println("비밀번호를 입력하세요");
			String password=sc.next();
			if (findById(id,password)==null) {
				System.out.println("아이디또는 비밀번호를를 틀리셨습니다.");
			}else
				System.out.println("계정을 정말 삭제하시겠습니까?/n1.네   2.아니요");
			 	num=sc.nextInt();
			 if (num==1) {
				 System.out.println("그동안 이용해주셔서 감사합니다.");
				 userList.remove(findById(id,password));
				 break;
			 }else if(num==2) {
				 System.out.println("취소하였습니다.");
				 break;
			 }else 
				 System.out.println("다시입력해 주세요.");
		}while(num!=9);
	}
	
	@Override
	public void LaundryMenu() {
		int price=0;
		int weight=0;
		int num=0;
		String type=null;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("----메뉴를 선택하세요----");
			System.out.println("1. 표준 세탁\n2. 드라이클리닝\n3. 이불 세탁");
			num=sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("세탁물의 무게를 입력해주세요");
				weight=sc.nextInt();
				type="표준 세탁";
				price=1000*weight;
				break;
			case 2:
				System.out.println("세탁물의 무게를 입력해주세요");
				weight=sc.nextInt();
				type="드라이클리닝";
				price=5000*weight;
				break;
			case 3:
				System.out.println("세탁물의 무게를 입력해주세요");
				weight=sc.nextInt();
				type="이불 세탁";
				price=3000*weight;
				break;
			default:
				System.out.println("메뉴에 없는 번호입니다. 다시 입력하세요.");
			}
		}while(num<1 || num>3);
		Cloth cloth=new Cloth(type ,weight ,price, login);
		clothList.add(cloth);
		System.out.println(num+"번 메뉴\n"+weight+"Kg\n"+"가격은 "+price+"원");
		System.out.println("등록이 완료되었습니다.");
	}
	
	
	
	@Override
	public User findById(String id, String password) {
		for(User u:userList) {
			if(u.getId().equals(id) && u.getPassword().equals(password)) {
				return u;
			}
		}return null;
	}
	

	
}
