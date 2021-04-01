package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		// 1. Thread�� Thread Ŭ�����κ��� ���� �����带 ����
		//how1 : Beep Task��� ���� ��ü�� �̿���
		/*
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		*/
		
		//how2 : �͸�����ü�� �̿���
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
		
		//how3 : ���ٽ��� �̿�
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();	
			for(int i=0; i<5; i++) {		
				toolkit.beep();
				try { Thread.sleep(500); } catch(Exception e) {}
			}
		});
		
		// �۾� �����带 ����
		thread.start(); 
		
		// Main ������ ����
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}


