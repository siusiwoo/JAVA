package customer;

public class CustomVO {

	private String number;//고객 번호
	private String name; //고객이름
	private String call; //전화번호
	
	
	@Override
	public String toString() {
		return "CustomVO [number=" + number + ", name=" + name + ", call=" + call + "]";
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCall() {
		return call;
	}
	public void setCall(String call) {
		this.call = call;
	}
	
}
