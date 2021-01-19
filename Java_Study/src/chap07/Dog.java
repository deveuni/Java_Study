package chap07;
// 추상 메소드 오버라이딩
public class Dog extends Animal {
	
	public Dog() {
		this.kind = "포유류";
	}
	
	// 추상 메소드 정의
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
