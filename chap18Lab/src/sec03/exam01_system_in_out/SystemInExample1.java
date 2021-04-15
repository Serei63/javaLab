package sec03.exam01_system_in_out;

import java.io.InputStream;

public class SystemInExample1 {
	public static void main(String[] args) throws Exception {		
		System.out.println("== 메뉴 ==");
		System.out.println("1. 예금 조회");
		System.out.println("2. 예금 출금");
		System.out.println("3. 예금 입금");
		System.out.println("4. 종료 하기");
		System.out.print("메뉴를 선택하세요: ");
		
		// 바이트 기반의 입력 스트림을 생성
		InputStream is = System.in;		// 콘솔의 바이트 기반의 입력 스트림 
		char inputChar = (char) is.read();			
		switch(inputChar) {
			case '1':
				System.out.println("예금 조회를 선택하셨습니다.");
				break;
			case '2':
				System.out.println("예금 출금를 선택하셨습니다.");
				break;
			case '3':
				System.out.println("예금 입금를 선택하셨습니다.");
				break;
			case '4':
				System.out.println("종료 하기를 선택하셨습니다.");
				break;
		}			
	}
}
