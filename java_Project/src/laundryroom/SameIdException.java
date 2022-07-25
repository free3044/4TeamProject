package laundryroom;
/** 같은 아이디가 등록되지 않도록 Exception 예외처리를 위한 클래스
 * 
 * */
public class SameIdException extends Exception{
	public SameIdException() {
		super("SameIdException");/**@param 부모클래스의 기본생성자를 호출하기 위해 super 를 사용하였다.*/
	}
	public SameIdException(String msg) {
		super(msg);/**@param 입력받은 문자열을 출력*/
	}
	

}
