package sec02.exam01_createthread;

// ThreadEnd는 Thread의 하위 클래스
public class ThreadEnd extends Thread {

	@Override
	public void run() {
		// thread가 시작되면 실행되는 문장
		for (int i = 1; i <= 20; i++) {
			System.out.println("run number = " + i);
		}
	}

	public static void main(String[] args) {
		// 2. Thread를 Thread 하위 클래스로부터 생성
		ThreadEnd te = new ThreadEnd();
		// 작업 스레드가 수행. thread를 실행시킴
		te.start();

		// Main 스레드가 수행
		// main()내에서 화면에 101부터 120까지 출력
		for (int i = 101; i <= 120; i++) {
			System.out.println("-------> main number = " + i);
		}
	}

}
