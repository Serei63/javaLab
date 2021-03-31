package verify.exam00;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class YearCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("연도를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		/*
		 if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
		System.out.println(year + "은 윤년");
		} else {
		System.out.println(year + "은 평년");
		}
		*/
		// 작성위치
		
		GregorianCalendar leapYearCheck = new GregorianCalendar();
		if(leapYearCheck.isLeapYear(year)) {
			System.out.println(year+"년은 윤년");
		} else {
			System.out.println(year+"년은 평년");
		}

	}

}
