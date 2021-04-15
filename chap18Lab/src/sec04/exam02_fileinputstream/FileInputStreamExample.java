package sec04.exam02_fileinputstream;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			// 바이트 기반 입력스트림
			FileInputStream fis = new FileInputStream("C:\\dev\\workspace\\git\\javaLab\\chap18Lab\\src\\sec04\\exam02_fileinputstream\\FileInputStreamExample.java");
			int data;
			while ( (data = fis.read() ) != -1 ) {
				System.out.write(data);
			}
			fis.close();	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

