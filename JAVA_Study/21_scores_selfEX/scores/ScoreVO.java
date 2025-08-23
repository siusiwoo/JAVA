package scores;

public class ScoreVO {
	private String studNo;//학번
	private String name; //이름
	private int kor,eng,mat,tot;//국영수 총점
	private double avg;//평균
	
	public String getStudNo() {
		return studNo;
	}
	public String getName() {
		return name;
	}
	
	public String toString() {
		if(studNo == null || name == null) return null;
		String str = String.format("%5s %5s %5d %5d %5d %5d %5f", studNo,name,kor,eng,mat,tot,avg);
		return str;
	}
	
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMat() {
		return mat;
	}
	public int getTot() {
		return tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setStudNo(String studNo) {
		this.studNo = studNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
}