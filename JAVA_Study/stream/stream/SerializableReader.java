package stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializableReader {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis =new FileInputStream("src/Object.txt");
		//객체를 역직렬화하기 위해 보조 스트림 클래스 이용
		ObjectInputStream ois = new ObjectInputStream(fis);
		ClassA ao = (ClassA) ois.readObject();
		System.out.println(ao.field1);
		System.out.println(ao.field2.field1);
		System.out.println(ao.field3);
		System.out.println(ao.field4);
		
	}
}
