package generic;

public class Exam02_generic {
	public static void main(String[] args) {
		Present<String> present1 = new Present<String>();
		present1.setValue("고소영");
		String name = present1.getValue();
		System.out.println("이 선물은 "+name+"의 것이다.");
		
		Present<Integer> present2 = new Present<Integer>();
		present2.setValue(10);
		int num = present2.getValue();// 래퍼타입은 기본타입을 넣을떄 자동 형변환 됨
		System.out.println("선물을"+num+"개를 받았다.");
	}
	
}
