package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam01_InputStream {
	public static void main(String[] args) throws IOException {
		// InputStream : 추상 클래스로 모든 바이트 기반 입력 스트림은 이 클래스를 상속받아서 만들어진다. 
		//바이트 기반 입력 스트림의 최상위 클래스
		try {
		InputStream is = new FileInputStream("img./sajin.jpg");// 매개변수 없는 생성자 함수는 없다?   클래스에는 매개변수가 없는 생성자가 존재하지 않기 때문입니다.
		int readByte;
		int num = 0;
		System.out.println("이미지 파일 읽어오기");
		while((readByte = is.read()) != -1) {
			System.out.print(readByte+" ");
			num++;
		}
		System.out.println("===num : "+num+"====");
		is.close();
		} catch(FileNotFoundException e) {
			 e.printStackTrace();
			 System.out.println("해당파일이 없습니다.");
		 }
		
	}
}
