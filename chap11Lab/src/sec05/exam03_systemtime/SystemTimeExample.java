package sec05.exam03_systemtime;

public class SystemTimeExample {
		
	public static void main(String[] args) {
		
		// 정적 메소드는 객체 생성 없이 클래스이름명.메소드() 의 형태로 직접 메소드를 호출할 수 있다
		long time = System.nanoTime();
		
		int sum = 0;
		for(int i = 1; i<=1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1~1000000의 합 : "+sum);
		System.out.println("계산에 "+(time2-time)+" 나노초가 소요되었습니다.");
		
	}

}
