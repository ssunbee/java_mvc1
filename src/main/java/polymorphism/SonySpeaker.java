package polymorphism;

import org.springframework.stereotype.Component;


public class SonySpeaker implements Speaker  {


	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker 볼륨 올린다");
		
	}

	
	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker 볼륨 내린다");
		
	}
	
}
