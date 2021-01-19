package chap07;

public class PhoneExample {

	public static void main(String[] args) {

		// 추상 클래스는 생성자를 호출해서 객체를 생성할 수 없다.
		// Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
