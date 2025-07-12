package classes;
class Friend{
	String name;
	int age;
	Friend(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	//Friend(){}
	void printFriend() {
		System.out.println("내 친구 "+name+"은 나이가 "+age+"살이다.");
	}
}
class Company{
	String name;
	int duration;
	
	Company(String name,int duration){
		this.name = name;
		this.duration = duration;
	}
	
	void printCompany() {
		System.out.println("나는 "+name+" 이 회사에 다닌지"+duration+"년째이다.");
	}
}

public class Exam03 {
	public static void main(String[] args) { 
		Friend friend = new Friend("김친구",18);
//		friend.name="김친구";
//		friend.age=18;
		friend.printFriend();
		
		Company company = new Company("SK",10);
//		company.name="Sk";
//		company.duration=10;
		
		company.printCompany();
		
	}	
	
}
