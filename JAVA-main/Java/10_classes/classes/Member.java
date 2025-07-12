package classes;

	// 매개변수 없는거 인스터스를 호출할때
	// 매개변수 있는거 데이터 초기화 하고싶을때 매개변수있는거를사용

public class Member {  
 public String name; // 아무것도 안하면 NULL
 public String id;// String 객체 주소값이 들어있음
 public String password;
 public int age;
 
 	Member(){
 		//무조건 생성자 함수부터 실행 되고 실행부분이 실행됨
 		//매개 변수가 있는게 나왔을때 매개변수가 없는거에 뭘 만들어야해? 생성자 함수인가
 		
	 System.out.println("Member객체가 생성되었습니다.");
 	}
 	
 	 Member(String name,String id){
 		this.name = name;//this는 Member을 가르킴
 		this.name = id;
 		System.out.println(name+","+id);
 	}
}
