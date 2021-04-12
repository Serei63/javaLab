package sec04.stream_filtering;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "신용권", "감자바", "신용권", "신민철");
		
		names.stream()
			.distinct()
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		names.stream()
			.filter(n -> n.startsWith("신"))
			// .filter(String :: startsWith("신")) 	// 매개변수의 메소드 참조: 매개변수의 클래스명::메소드명
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		names.stream()
			.distinct()
			.filter(n -> n.startsWith("신"))
			.forEach(n -> System.out.println(n));		
	}
}

