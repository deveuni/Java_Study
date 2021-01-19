package chap07;
// 객체 타입 변환
public class InstanceofExample {

	public static void method1(Parent2 parent) {
		// Child 타입으로 변환이 가능한지 확인
		if(parent instanceof Child2) {
			Child2 child = (Child2) parent;
			System.out.println("method1 - Child 변환 성공");
		}else {
			System.out.println("method1 - Child 변환 실패");
		}
	}
	
	public static void method2(Parent2 parent) {
		// ClassCastException이 발생할 가능성 있음
		Child2 child = (Child2) parent;
		System.out.println("mehtod2 - Child로 변환 성공");
	}
	
	
	public static void main(String[] args) {
		
		Parent2 parentA = new Child2();
		// Child 객체를 매개값으로 전달
		method1(parentA);
		method2(parentA);
		
		Parent2 parentB = new Parent2();
		// Parent 객체를 매개값으로 전달
		method1(parentB);
		method2(parentB); // 예외 발생
		
	}

}
