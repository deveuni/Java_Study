package chap06;

public class Car5Example {

	public static void main(String[] args) {
		
		Car5 myCar = new Car5();
		
		// 잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		// 올바른 속도 변경 
		myCar.setSpeed(60);
		
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		// 멈춤
		if(!myCar.isStop()) { // 현재속도 60이므로 정지 상태가 아님 = isStop()이 false일 때, 
			myCar.setStop(true); // 이 문장 실행 => setStop이 true일 때, 정지상태가 되고, 스피드는 0이 나온다.
		}
		
		System.out.println("현재 속도: " + myCar.getSpeed());

	}

}
