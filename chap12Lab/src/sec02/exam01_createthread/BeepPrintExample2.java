package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		// 1. Thread를 Thread 클래스로부터 직접 스레드를 생성
		//how1 : Beep Task라는 구현 객체를 이용함
		/*
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		*/
		
		//how2 : 익명구현객체를 이용함
		/*Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				for(int i=0; i<5; i++) {		
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
		});*/
		
		//how3 : 람다식을 이용
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();	
			for(int i=0; i<5; i++) {		
				toolkit.beep();
				try { Thread.sleep(500); } catch(Exception e) {}
			}
		});
		
		// 작업 스레드를 수행
		thread.start(); 
		
		// Main 스레드 수행
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}


