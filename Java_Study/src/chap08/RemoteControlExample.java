package chap08;
// 인터페이스 변수에 구현 객체 대입
public class RemoteControlExample {

	public static void main(String[] args) {

		RemoteControl rc = null;
		
		// 디폴트 메소드 사용
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true); 
		
		// 정적 메소드 사용
		RemoteControl.changeBattery();
		
	
		
	}

}
