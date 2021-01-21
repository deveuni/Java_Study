package chap08;
// 익명 구현 클래스
public class RemoteControlExample2 {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				/* 실행문 */
				
			}
			
			@Override
			public void turnOff() {
				/* 실행문 */
				
			}
			
			@Override
			public void setVolume(int volume) {
				/* 실행문 */
				
			}
		};

	}

}
