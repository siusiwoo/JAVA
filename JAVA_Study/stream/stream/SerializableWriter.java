package stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableWriter {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("src/Object.txt");
		//보조 스트림클래스로 바이트 스트림으로 직렬화하기 위해 필요한 객체를 생성
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		ClassA classA = new ClassA();
		classA.field1 = 10;
		classA.field2.age = 40;
		classA.field2.name = "유재석";
		classA.field3 = 100;
		classA.field4 = 5;
		
		oos.writeObject(classA);
		oos.flush(); oos.close(); fos.close();
		System.out.println("객체를 직렬화해서 파일에 저장");
		
	}
}
