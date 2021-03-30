package sec09.exam01_stringbuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, " ");
		System.out.println(sb.toString());

	}

}
