package chap08;

public class RemoteControlExample3 {

	public static void main(String[] args) {

		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
		Searchable sc = tv;
		sc.search("https://www.naver.com/");
	}

}
