package sec06.exam03_join;

public class JoinExample {
	// main �����尡 ����
	public static void main(String[] args) {
		// �۾� �����带 ����
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			// �۾� �����尡 �Ϸ�� ������ main �����带 �Ͻô�� ���·� �Ѵ�.
			sumThread.join();
		} catch (InterruptedException e) {
		}
		System.out.println("1~100 ��: " + sumThread.getSum());
	}
}

