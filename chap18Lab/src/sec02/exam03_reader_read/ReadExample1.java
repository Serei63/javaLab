package sec02.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		// 문자 기반의 입력 스트림 Reader를 생성
		Reader reader = new FileReader("C:/Temp/test.txt");
		int readData;
		
		while( true ) {
			readData = reader.read();
			if(readData == -1) break;
			System.out.print((char)readData);
		}
		
		reader.close();
	
	}

}
