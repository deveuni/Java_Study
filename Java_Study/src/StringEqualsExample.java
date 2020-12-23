
public class StringEqualsExample {

	public static void main(String[] args) {
		
		String strVar1 = "흑설탕";
		String strVar2 = "흑설탕";
		String strVar3 = new String("흑설탕");
		// 리터럴이 같으면 같은 객체의 번지를 같고, 
		// new 연산자를 통해 새로운 객체를 만들면 객체의 번지가 다르다.
		
		System.out.println( strVar1 == strVar2);
		System.out.println( strVar1 == strVar3);
		System.out.println();
		System.out.println( strVar1.equals(strVar2));
		System.out.println( strVar1.equals(strVar3));
		// String 객체의 문자열만을 비교하고 싶다면 equals() 메소드를 사용해야 한다.

	}

}
