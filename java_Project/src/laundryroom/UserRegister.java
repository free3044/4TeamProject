package laundryroom;
import java.util.*;
/**UserRegister 클래스입니다. UserInterface에 상속받습니다.
 * */
public class UserRegister implements UserInterface {
	/**@param 프로그램에 사용되는 메소드를 모으는 곳입니다. 
	 * @see UserInterface
	 * @serialField ArrayList userList 회원가입을 할 때 저장되는 List입니다.
	 * @serialField ArrayList clothList 세탁물 등록을 할 때 저장되는 List입니다.
	 *  Scanner sc : 프로그램 사용 시 입력합니다.
	 *  User login : 사용자가 로그인을 할때 저장되는 변수입니다.
	 *  Cloth laundry : 세탁물을 등록할 때 사용하는 변수입니다.
	 * */
	
	List<User> userList=new ArrayList<>();
	List<Cloth> clothList=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	User login=null;
	Cloth laundry=new Cloth(null, 0, 0, login);
	
	
	@Override
	public void Account() {
		/**@param 회원가입을 할때 사용되는 메소드입니다.
 		 *기본적으로 ID, password, 이름, 주소, 연락처를 입력받습니다.
 		 *입력을 다받으면 User클래스를 기준으로 ArrayList에 저장됩니다.*/
		System.out.println("ID를 입력하십시오=>");
		
		String id=sc.next();
		try {/**@throws 사용자 정의 예외를 만들어 같은아이디가있을경우 예외처리합니다.*/
			for (int i=0;i<userList.size();i++) {
				boolean bool=userList.get(i).getId().equals(id);
				if (bool==true) 
				throw new SameIdException("이미 있는 아이디입니다.");
			}
		}catch (SameIdException ex) {
			String msg=ex.getMessage();
			System.out.println(msg);
			return;
		}
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
		
	}
	
	
	@Override
	public void Join() {
		/**@param 로그인을 할 때 사용되는 메소드입니다.
 *  	- @param boolean bl,bl2의 변수를 사용합니다. bl은 아이디를 체크하고 bl2는 비밀번호를 확인합니다.
 *  	- EveryInfo()를 제외한 모든 메소드는 로그인을 통해야 작동됩니다.*/
		boolean bl=false; 
		boolean bl2=false; 
		while(!(bl==true && bl2==true)) {
			System.out.println("Id를 입력해 주세요=>");
			String id=sc.next();
			System.out.println("비밀번호를 입력해 주세요=>");
			String password=sc.next();
			for (int i=0;i<userList.size();i++) {
				/**@param if문에서 true면 변수 login에 회원가입한 정보가 저장됩니다.*/
				bl=userList.get(i).getId().equals(id);
				bl2=userList.get(i).getPassword().equals(password);
				
				if(bl && bl2) {
					 login=findById(id,password);
					 System.out.println(userList.get(i).getName()+"님");
				 	 System.out.println("환영합니다.");
				} 
			}
		}
	}
	
	@Override
	public void UpdateUser() {
		/**@param 사용자의 정보를 변경하기 위한 메소드입니다.
		 * @param int num은 변경하고싶은 정보를 선택하는 변수입니다.*/
		System.out.println("회원 정보 변경 입니다.");
		int num=0;
		do {
			
			if (login==null) {
				System.out.println("로그인이 필요한 구간입니다.");
				return;
			}else
				System.out.println("변경하시려는 항목을 선택하세요");
				System.out.println("1.비밀번호 변경 2.주소변경 3.연락처변경");
			num=sc.nextInt();
			/**@param 정보의 변경을 위해 현재 저장되어있는 데이터에 set타입을 사용하여 덮어씌었습니다.*/
			if(num==1) {
				System.out.println("비밀번호 변경입니다.");
				System.out.println("변경하시려는 비밀번호를 입력하세요");
				String password=sc.next();
				login.setPassword(password);
				break;
			}else if(num==2) {
				System.out.println("주소 변경입니다.");
				System.out.println("변경하시려는 주소를 입력하세요");
				String address=sc.next();
				login.setAddress(address);
				break;
			}else if(num==3) {
				System.out.println("연락처 변경입니다.");
				System.out.println("변경하시려는 연락처를 입력하세요");
				int phoneNumber=sc.nextInt();
				login.setPhoneNumber(phoneNumber);
				break;
			}else System.out.println("다시입력해 주세요.");
		}while(num!=9);
		System.out.println("변경이 완료되었습니다!!");
		
	}
	@Override
	public void deleteUser() {
		/** @param 사용자 정보를 삭제하는 메소드입니다.
		 * @param int num은 재요청을 위한 변수입니다.*/
		int num=0;
		System.out.println("회원 정보 삭제입니다.");
		do {
			if (login==null) {
				System.out.println("로그인이 필요한 구간입니다.");
				return;
			}else
				/**갑작스런 삭제를 방지하기위해 num을 사용하여 재요청을 한 뒤에 삭제를 합니다.*/
				System.out.println("계정을 정말 삭제하시겠습니까?/n1.네   2.아니요");
			 	num=sc.nextInt();
			 if (num==1) {
				 System.out.println("그동안 이용해주셔서 감사합니다.");
				 userList.remove(login);
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
		/** @param 세탁물 등록을 위한 메소드입니다.
		 *  int num은 세탁물 선택을 위한 변수입니다.
		 *  같은 사용자가 등록하면 전기록에 덮어쓰여집니다.
		 *  등록을 완료하면 사용자가 등록한 정보를 출력합니다.*/
		int num=0;
		if (login==null) {
			System.out.println("로그인이 필요합니다.");
			return;
			}else
			do {/**@param 잘못입력했을 경우 반복됩니다.*/
				System.out.println("----메뉴를 선택하세요----");
				System.out.println("1. 표준 세탁\n2. 드라이클리닝\n3. 이불 세탁");
				num=sc.nextInt();
				;
				switch(num) {
				/**@param 재방문이 있을 수 있기에 set()을 사용하였습니다.*/
				case 1:
					System.out.println("세탁물의 무게를 입력해주세요");
					laundry.setType("표준 세탁");
					laundry.setWeight(sc.nextInt());
					laundry.setPrice(laundry.getWeight()*1000);
					break;
				case 2:
					System.out.println("세탁물의 무게를 입력해주세요");
					laundry.setType("드라이클리닝");
					laundry.setWeight(sc.nextInt());
					laundry.setPrice(laundry.getWeight()*5000);
					break;
				case 3:
					System.out.println("세탁물의 무게를 입력해주세요");
					laundry.setType("이불 세탁");
					laundry.setWeight(sc.nextInt());
					laundry.setPrice(laundry.getWeight()*3000);
					break;
				default:
					System.out.println("메뉴에 없는 번호입니다. 다시 입력하세요.");
				}
			}while(num<1 || num>3);
		
		Cloth cloth=new Cloth(laundry.getType() ,laundry.getWeight() ,laundry.getPrice(), login);
		clothList.add(cloth);
		System.out.println(laundry.getType()+"이며 \n무게는"+laundry.getWeight()+"Kg\n"+"가격은 "+laundry.getPrice()+"원");
		System.out.println("등록이 완료되었습니다.");
	}
	@Override
	public void Mypage() { 
		/**@param 사용자의 정보를 확인하기 위한 메소드입니다.
		 *int num은 마이페이지에서 선택하기 위한 변수입니다.
		*/
		int num=0;
		if(login==null) {
			System.out.println("로그인이 필요합니다.");
			return;
		}else
			/**현재 사용자의 정보나 세탁물 정보를 확인할수있습니다.*/
			System.out.println("마이 페이지 입니다./n 1.개인정보    2.세탁물정보");
			num=sc.nextInt();
			if (num==1) {
				/**사용자 정보는 비밀번호를 제외한 정보를 볼수있게 했습니다*/
				System.out.println("정보를 출력합니다.");
				System.out.println(login);
				}else if(num==2) {
					/**세탁물 정보는 타입, 무게 또는 벌, 가격을 볼수있게 했습니다
					 *세탁물을 등록을 안하고 확인을 하면 Cloth laundry에 의해 기본값으로 출력됩니다. */
					System.out.println("세탁물정보입니다.");
					System.out.println(laundry);
					
					
			}else System.out.println("없는 번호입니다. 메인화면으로 돌아갑니다.");
			
	}
	@Override
	public void EveryInfo() {
		/** @param 모든 사용자와 세탁물을 볼수있는 메소드입니다.*/
		System.out.println("모든정보를 출력합니다.");
		Iterator<User> it=userList.iterator();
		Iterator<Cloth> it2=clothList.iterator();
		while(it.hasNext() || it2.hasNext()) {
			User user=it.next();
			System.out.println(user);
			System.out.println("세탁물정보");
			try {
				Cloth cloth=it2.next();
				System.out.println(cloth);
				System.out.println("------------");
			}catch(NoSuchElementException e){
				/**세탁물을 한번도 등록한 사람이 아니라면 예외처리를 사용해 메세지를 출력*/
				System.out.println("등록된 세탁물이없습니다.!! ");
			}
		}
			
	}
	
	public void Logout() {
		/**@param 로그아웃을 할 수 있는 메소드입니다.
		 *int num은 재요청을 위한 변수입니다.*/
		if(login==null) {
			System.out.println("로그인을 먼저해주세요");
		}else
			System.out.println("로그 아웃하시겠습니까? /n 1.네   2.아니요");
			int num=sc.nextInt();
			if (num==1) {
				/**로그아웃을 할 경우 login의 값이 null값으로 되며 다른 메뉴를 사용할수없습니다.*/
				login=null;
			}else System.out.println("메인으로 돌아갑니다.");
	}
	
	
	@Override
	public User findById(String id, String password) {
		/**@param 로그인을 위한 메소드입니다.
		 * 또한 id와 password가 들어가 있는 userList를 출력합니다. 
		 */  
		for(User u:userList) {
			/**userList에 String id와 password가 동일한 배열에 들어가있는지 확인합니다.*/
			if(u.getId().equals(id) && u.getPassword().equals(password)) {
				return u;
			}
		}return null;
	}
	

	
}
