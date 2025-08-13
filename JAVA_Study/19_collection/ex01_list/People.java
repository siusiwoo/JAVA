package ex01_list;

public class People {
	private String name;
	private String num;
	
	public People(String string) {
		this.name = name;
		this.num = num;
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "People [이름:"+name+", 연락처:"+num+"]";
	}
}
