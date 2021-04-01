package verify.exam00;

// 인터페이스 Runnable을 구현클래스로 생성
// 작성 위치
public class MyRun implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.print("S");
		}
		
	}

}
