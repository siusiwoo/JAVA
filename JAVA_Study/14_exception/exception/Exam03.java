package exception;

public class Exam03 {
	public static void main(String[] args) {
		try {
			String data1 = null;
			String data2 = null;
			
			data1 = args[0];
			data2 = args[1];
			
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			System.out.println(val1+val2);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 맞지 않습니다.");
			e.printStackTrace();
		}catch (NumberFormatException e) {
			System.out.println("데이터를 정수로 변환할 수 없습니다.");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("알 수 없는 예외가 발생하였습니다.");
			e.printStackTrace();
		}
		
	}
}
