package sec05.exam03_systemtime;

public class SystemTimeExample {
		
	public static void main(String[] args) {
		
		// ���� �޼ҵ�� ��ü ���� ���� Ŭ�����̸���.�޼ҵ�() �� ���·� ���� �޼ҵ带 ȣ���� �� �ִ�
		long time = System.nanoTime();
		
		int sum = 0;
		for(int i = 1; i<=1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1~1000000�� �� : "+sum);
		System.out.println("��꿡 "+(time2-time)+" �����ʰ� �ҿ�Ǿ����ϴ�.");
		
	}

}
