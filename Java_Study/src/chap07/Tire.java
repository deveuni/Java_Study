package chap07;
// 타이어 클래스
public class Tire {
	// 필드
	public int maxRotation;			// 최대 회전수(타이어수명)
	public int accumulateRotation;	// 누적 회전수
	public String location;			// 타이어의 위치
	
	// 생성자
	public Tire(String location,int maxRotation) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	// 메소드
	public boolean roll() {
		++accumulateRotation; // 누적 회전수 1 증가
		if(accumulateRotation < maxRotation) {
			System.out.println(location + " Tire 수명: " + 
				(maxRotation-accumulateRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
		
	}
}
