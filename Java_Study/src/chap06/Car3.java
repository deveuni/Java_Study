package chap06;

// 생성자 오버로딩
// 다른 생성자 호출 (this())
// 생성자 오버로딩이 많아질 경우 생성자 간의 중복된 코드가 발생할 수 있다.
// => 초기화 내용을 한 생성자에 몰아서 작성한다.
// => 다른 생성자는 초기화 내용을 작성한 생성자를 this(..)로 호출한다.

public class Car3 {
	
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 
	Car3(){}
	
	Car3(String model){
		this(model, "은색", 250); // 호출
	}
	
	Car3(String model, String color){
		this(model, color, 250); // 호츌
	}
	
	Car3(String model, String color, int maxSpeed){
		
		// 공통 실행 코드
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	

}
