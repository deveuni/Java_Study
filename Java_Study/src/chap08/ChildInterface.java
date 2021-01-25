package chap08;
// 자식 인터페이스
public interface ChildInterface extends ParentInterface{
	public void method3();

	
	// 디폴트 메소드 재정의
	@Override
	default void method2() {
	}
	
	
	
}
