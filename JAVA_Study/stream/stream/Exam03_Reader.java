package stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam03_Reader {
	public static void main(String[] args) throws IOException {
		try {
			Reader reader = new FileReader("C:/Users/GREEN/test.txt");
			int readData;
			while((readData = reader.read()) !=-1) {
				System.out.print((char)readData);
			}
			reader.close()
			
;		} catch (FileNotFoundException e) {

			e.printStackTrace();
			System.out.println("해당 파일이 없습니다.");
			
		}
		
	}
}
