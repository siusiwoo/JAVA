package classes;


public class Exam02 {
	public static void main(String[] args) {//같은 패키지 안에서는 임폴트 X 다른 패키지에서 가져오는거라
		Member member = new Member();
		member.name = "송하영";//인스턴스명.필드명
		member.id="cat";
		member.password="0929";
		member.age =29;
		System.out.println(member.name+"회원님의 아이디는"+member.id+"이고 비번은 "+member.password+"이고 나이는"+member.age+"살이다.");

		Member member2 = new Member("하하","haha");
	}
	
}
