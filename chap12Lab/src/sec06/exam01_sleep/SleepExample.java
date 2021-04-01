package sec06.exam01_sleep;

import java.awt.Toolkit;

// main Thread가 main() 메소드 실행
public class SleepExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();		
		for(int i=0; i<10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000);
				// Thread.sleep() 은 자신의 스레드를 일시정지 상태로 만든다.
			} catch(InterruptedException e) {			
			}		
		}	
	}
}
