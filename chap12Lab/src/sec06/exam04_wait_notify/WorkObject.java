package sec06.exam04_wait_notify;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify();		// 다른 일시정지 상태의 스레드를 RUNNABLE 상태로 한다.
		try {	
			wait();	// 자신을 일시정지 상태로 만든다.
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
}
