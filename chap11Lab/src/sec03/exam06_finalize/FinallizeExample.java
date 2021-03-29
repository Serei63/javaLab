package sec03.exam06_finalize;

public class FinallizeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = null;
		
		for(int i = 1; i<=50; i++) {
			counter = new Counter(i);
			counter = null;
			System.gc(); 	//Garbage Collecter를 강제로 실행
		}

	}

}
