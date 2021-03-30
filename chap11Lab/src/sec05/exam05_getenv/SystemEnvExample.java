package sec05.exam05_getenv;

public class SystemEnvExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String javaHome = System.getenv("java.1.8");
		System.out.println("[ JAVA_HOME ]  " + javaHome);

	}

}
