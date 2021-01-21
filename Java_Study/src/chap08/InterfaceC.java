package chap08;
// 하위 인터페이스
public interface InterfaceC extends InterfaceA, InterfaceB{
	// InterfaceA, B의 추상 메소드 모두 가지고 있음.
	public void methodC();
}
