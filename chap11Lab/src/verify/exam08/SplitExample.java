package verify.exam08;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "���̵�,�̸�,�н�����";
		// �ۼ� ��ġ
		// #1: split() �޼ҵ� �̿�
		String[] strSplit = str.split(",");
		for(String strs : strSplit) {
			System.out.println(strs);
		}
		
		System.out.println();
		// #2: StringTokenizer �̿�
		StringTokenizer strTkn =  new  StringTokenizer(str, ",");
		int countTokens = strTkn.countTokens();
		for(int i = 0; i<countTokens; i++) {
			String token = strTkn.nextToken();
			System.out.println(token);
		}

	}

}
