package chap04;

public class ContinueExample {

	//continue문을 사용하여 짝수만 출력하는 코딩
	
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 !=0 ) {
				continue;
			}
			System.out.println(i);
		}

	}

}
