package File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Exam01_File {
	public static void main(String[] args) {
		File dir = new File("C:\\Users\\GREEN\\dir");
		File file = new File("C:\\Users\\GREEN\\dir\\file.txt");
		if(dir.exists() == false) {
			dir.mkdir();
		}
		if(file.exists() == false) {
			try {
			file.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
				System.out.println("파일 생성 에러");
			
			}
		}
		
		File temp = new File("C:\\Users\\GREEN");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		File[] contents = temp.listFiles(); // 폴더에 포함된 파일이나 서브 폴더 목록 전부를 FIle 배열로 리턴
		System.out.println("날짜\t시간\t형태\t크기\t이름\n");
		System.out.println("===========================");
		for(File file2:contents) {
			System.out.println(sdf.format(file.lastModified()));
			if(file2.isDirectory()) {
				System.out.println("\t<dir>\t"+file.getName());
			}else {
				System.out.println("\t"+file.length()+file.getName());
			}
			
			
		}
				
	}	

}
