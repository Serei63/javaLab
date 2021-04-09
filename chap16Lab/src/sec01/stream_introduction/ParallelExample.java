package sec01.stream_introduction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ParallelExample {	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "신용권", "감자바", "람다식", "박병렬");
		
		//순차 처리
		Stream<String> stream = list.stream();
		
		// 익명구현객체
		/*
		stream.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				ParallelExample.print(t);
			}
		});
		*/
		
		// 람다식
		stream.forEach( t -> ParallelExample.print(t));
		
		// 정적 메소드 참조
		//stream.forEach(ParallelExample :: print);
		
		System.out.println();
		
		//병렬 처리
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample :: print);
	}
	
	public static void print(String str) {
		System.out.println(str+ " : " + Thread.currentThread().getName());
	}	
}
