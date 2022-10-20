package polymorphism;

public class SamsungTV implements TV{
	
	private Speaker speaker;
	public int price;
	
	public SamsungTV() {
	System.out.println("삼성티비 객체 생성");
	}
	public SamsungTV(Speaker speaker) {
	System.out.println("삼성티비2 객체 생성");
	this.speaker=speaker;
	}
	
	public SamsungTV(Speaker speaker , int price) {
		System.out.println("삼성티비3 객체 생성");
		this.speaker=speaker;
		this.price=price;
		}
	
	
	


	public void setSpeaker(Speaker speaker) {
		System.out.println("=====>setSpeaker() 호출");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println("=====>setPrice() 호출");
		this.price = price;
	}
	
	
	
	public void powerOn() {
		System.out.println("삼성티비전원킨다"+price);
		
	}


	
	public void volumeUp() {
		speaker.volumeUp();
	}

	
	public void volumeDown() {
		speaker.volumeDown();
	}
	
	
	public void powerOff() {
		System.out.println("삼성티비전원끈다");
		
	}

}
