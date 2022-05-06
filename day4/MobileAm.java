package week1.day4;

public class MobileAm  {
	public void message() {
		System.out.println("send message");
	}
	private void audioCall() {
		System.out.println("audio call");
	}
	protected void videoCall() {
		System.out.println("video call");
		
	}
	void sharedDocument() {
		System.out.println("shared documents");
	}
	public static void main(String[] args) {
		MobileAm mob=new MobileAm();
		mob.message();
		mob.audioCall();
		mob.videoCall();
		mob.sharedDocument();
		
	}
}
