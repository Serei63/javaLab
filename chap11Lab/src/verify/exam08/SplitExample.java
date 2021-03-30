package verify.exam08;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "아이디,이름,패스워드";
		// 작성 위치
		// #1: split() 메소드 이용
		String[] strSplit = str.split(",");
		for(String strs : strSplit) {
			System.out.println(strs);
		}
		
		System.out.println();
		// #2: StringTokenizer 이용
		StringTokenizer strTkn =  new  StringTokenizer(str, ",");
		int countTokens = strTkn.countTokens();
		for(int i = 0; i<countTokens; i++) {
			String token = strTkn.nextToken();
			System.out.println(token);
		}

	}

}
