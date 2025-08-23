package scores;

public interface Score {
	public void input(); // 입력
	public void print(); // 출력
	public void printTitle(); // 제목 출력
	public void searchStuNo(); // 학번으로 검색
	public void searchName(); // 이름으로 검색
	public void descSortTot(); // 총점 기준으로 내림차순
	public void ascSortStuNo(); // 학번 기준으로 오름차순
	public void saveFile(); // 파일 저장
	public void readFile(); // 파일 읽기
}
