package sec01.stream_introduction;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class MapAndReduceExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30)
		);		
			
		double avg = studentList.stream()
			//중간처리(학생 객체를 점수로 매핑)
			
			/*
			// 익명구현객체
			.mapToInt(new ToIntFunction<Student>() {
				@Override
				public int applyAsInt(Student s) {
					return s.getScore();
				}
			})
			*/
				
			// 람다식
			//.mapToInt(s -> s.getScore())
			
			// 매개변수의 메소드 참조
			.mapToInt(Student :: getScore) // Stream<Student> -> intStream
			
			//최종 처리(평균 점수)
			.average()
			.getAsDouble();
		
		System.out.println("평균 점수: " + avg);
	}
}
