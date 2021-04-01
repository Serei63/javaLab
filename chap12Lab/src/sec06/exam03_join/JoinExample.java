package sec06.exam03_join;

public class JoinExample {
	// main 스레드가 실행
	public static void main(String[] args) {
		// 작업 스레드를 생성
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			// 작업 스레드가 완료될 때까지 main 스레드를 일시대기 상태로 한다.
			sumThread.join();
		} catch (InterruptedException e) {
		}
		System.out.println("1~100 합: " + sumThread.getSum());
	}
}

