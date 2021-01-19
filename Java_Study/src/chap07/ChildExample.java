package chap07;
// 강제 타입 변환(캐스팅)
public class ChildExample {

	public static void main(String[] args) {
		
		// 자동 타입 변환
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		
		// 자식클래스가 부모 클래스로 자동 변환될 때는 부모 클래스의 필드와 메소드만 사용 가능 
		/*
		parent.field2;
		parent.method3();
		*/
		
		// 강제 타입 변환 
		// -> 자식 타입이 부모 타입으로 자동 변환 후, 다시 자식 타입으로 변환할 때 강제 타입 변환을 사용할 수 있다.
		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3();
	}

}
