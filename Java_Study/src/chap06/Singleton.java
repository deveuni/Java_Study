package chap06;

// 싱글톤
public class Singleton {
	
	// 정적필드 
	// 자신의 타입인 정적 필드를 하나 선언하고 자신의 객체를 생성해 초기화 한다.
	private static Singleton singleton = new Singleton();

	// 생성자 
	// 생성자를 외부에서 호출할 수 없도록 private 접근 제한자를 붙여준다.
	private Singleton() {}
	
	// 정적메소드 
	// 외부에서 호출할 수 있는 정적 메소드인 getInstance()를 선언하고 
	// 정적 필드에서 참조하고 있는 자신의 객체를 리턴한다.
	static Singleton getInstance() {
		return singleton;
	}
	
	
}
