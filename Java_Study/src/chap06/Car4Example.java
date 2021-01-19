package chap06;

// return문
public class Car4Example {

	public static void main(String[] args) {
		
		Car4 myCar = new Car4();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) { // gas가 있다면 => gas가 5 있음.
			System.out.println("출발합니다.");
			myCar.run(); // run()메소드를 호출해서  gas가 0이 될 때까지 반복
		}
		
		if(myCar.isLeftGas()) { // gas가 있을 때 
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else { // gas가 없을 때 
			System.out.println("gas를 주입하세요.");
		}

	}

}
