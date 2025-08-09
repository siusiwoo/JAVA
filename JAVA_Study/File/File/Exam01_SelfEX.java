package File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam01_SelfEX {
		public static void main(String[] args) throws IOException, InterruptedException {
			// 이미지를 복사하여 targetFileName
			String oriFileName = "C:\\Users\\GREEN\\img\\apple.PNG";
			String targetFileName = "C:\\Users\\GREEN\\img\\copy.jpg";
			
			InputStream is = new FileInputStream(oriFileName);
			OutputStream os = new FileOutputStream(targetFileName);
			
			int readByte;
			System.out.println("이미지 파일 읽어오기");
			while((readByte = is.read()) != -1) {
				System.out.print(readByte+" ");
				  os.write(readByte);
			}
			is.close();
			os.flush();
			os.close();
		}

}
