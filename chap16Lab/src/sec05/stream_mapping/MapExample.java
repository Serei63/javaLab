package sec05.stream_mapping;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class MapExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30)
		);
			
		studentList.stream()
		/* 
		 // 익명구현객체
			.mapToInt(new ToIntFunction<Student>() {
				@Override
				public int applyAsInt(Student s) {
					return s.getScore();
				}
			})
			*/
			//.mapToInt(s -> s.getScore())	// 람다식
			.mapToInt(Student :: getScore)	// 매개변수의 메소드 참조, 중간처리: 매핑(Student -> IntStream)
			.forEach(score -> System.out.println(score));
	}
}
