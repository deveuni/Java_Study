package chap08;
// 구현 클래스
public class Bus implements Vehicle {
	
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare() {
		System.out.println("승차요급을 체크합니다.");
	}
}
