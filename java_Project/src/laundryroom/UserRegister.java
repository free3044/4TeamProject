package laundryroom;
import java.util.*;
public class UserRegister  {
	//1] 회원가입 시스템 
	//1-1] 회원가입1 전체내용저장 2 아이디 비번으로 로그인을 해야함 
	//2] 배열 등록 (텍스트로 저장할수있을까?)
	//3] 로그인 시스템 쌍으로 등록해야한다 비밀번호 까지 등록
	//4] 로그인 한 다음 개인정도 출력??
	
	int count=0;
	List<User> userList=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
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
				 System.out.println(userList.get(i).getName()+"님");
				}
			}
		}System.out.println("환영합니다."); //마이페이지 갈수있겠금==>
		
		
	}
	public void UpdateUser() {
		
		
	}
	public void deleteUser() {
		
	}
	

}
