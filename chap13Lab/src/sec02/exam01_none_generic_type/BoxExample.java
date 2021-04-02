package sec02.exam01_none_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");	// 형변환, Object <- String
		String name = (String) box.get();
		
		box.set(new Apple());	// 형변환, Object <- Apple
		Apple apple = (Apple) box.get();
	}

}
