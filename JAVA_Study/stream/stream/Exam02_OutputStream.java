package stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam02_OutputStream {
	public static void main(String[] args) throws IOException {
		try {
			OutputStream os = new FileOutputStream("C:/Users/GREEN/test.txt");
			 byte[] data = "공부의 진짜 의미 목표가 올라가면 원금이 줄어든다".getBytes();//문자열을 바이트 형태로 변환하는데 (UTF-8일 경우 : 알파벳은 1바이트, 한글은 3바이트로 변환][EUC-KR일 경우 : 알파벳은 1바이트, 한글은 2바이트로 변환]한다.			
			 for(int i=0;i<data.length;i++) {
				 os.write(data[i]);
			 }
			 System.out.println("파일이 저장되었습니다.");
			 os.flush();// 모든 데이터가 출력되도록 하여 버퍼에 전류하는 데이터를 모두 출력시켜 버퍼를 비우는 역할
			 os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일이 생성되지 않았습니다.");
		}
		
	}
}
