package stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Exam05_SelfEX {
public static void main(String[] args) {
	// 사용자 에게 입렵받은 문구를 파일을 생성하여 저장해주기
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	try {
		Writer writer = new FileWriter("src/test.txt");
	
		writer.write(s);
		System.out.println("파일 생성하여 데이터 입력완료");
		writer.flush();
		writer.close();
	} catch (IOException e) {
		e.printStackTrace();
		System.out.println("파일 생성이 실패하였습니다");
	}
}
}
