package java_leesungmin;

public class Exam04 {

	public static void main(String[] args) {
		String str = "100";
		System.out.println(str + 100);
		
		byte b = Byte.parseByte(str);
		System.out.println(b+100);
	
		short s = Short.parseShort(str);
		System.out.println(s+100);
		
		int i = Integer.parseInt(str);
		System.out.println(i+100);
		
		long l = Long.parseLong(str);
		System.out.println(l+100);
		
		float f = Float.parseFloat(str);
		System.out.println(f+100);
		
		boolean bl = Boolean.parseBoolean(str);
		System.out.println(bl);
		
		boolean b2 = Boolean.parseBoolean("TRUE");
		System.out.println(b2);
	}

}
