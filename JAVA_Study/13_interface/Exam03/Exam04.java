package Exam03;

public class Exam04 {
	public static void printSound(Soundable Soundable) {
		System.out.println(Soundable.sound());
	}
public static void main(String[] args) {
	
	dog Dog = new dog();
	cat Cat = new cat();
	
	
	
	System.out.println(Dog.sound());
	System.out.println(Cat.sound());
	printSound(new cat());
	printSound(new dog());
	//다형성 구현
}	

}
