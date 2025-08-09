package stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam04_writer {
	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("src/test.txt");
			writer.write("내일은 일요일");
			System.out.println("파일 생성하여 데이터 입력완료");
			writer.flush();
			writer.close();
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("파일 생성이 실패하였습니다");
		}
	}
}
