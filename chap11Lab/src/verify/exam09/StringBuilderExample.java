package verify.exam09;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		for (int i = 1; i <= 100; i++) {
			str += i;
		}
		System.out.println(str);
		// �ۼ� ��ġ
		StringBuilder st = new StringBuilder();
		for(int i = 1; i <=100; i++) {
			st.append(i);
		}
		System.out.println(st.toString());
		System.out.println();

	}

}
