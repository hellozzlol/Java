package com.yedam.java.ch_08_01;

public class SmartTelevision implements RemoteControl,Serchable {
  private int volume;
	@Override
	public void search(String url) {
		
		System.out.println(url + "을 검색합니다.");

	}

	@Override
	
	public void turnOn() {
		
		System.out.println("tv를 켭니다");
		
	}
	
	
@Override
	
	public void turnOff() {
		
	System.out.println("tv를 끕니다");
		
	}

@Override
 public void setVolume(int volume) {
	if(volume >= RemoteControl.MAX_VOLUME) {
		this.volume = RemoteControl .MAX_VOLUME ;
	}else if(volume <=  RemoteControl .MIN_VOLUME) {
		this.volume = RemoteControl.MIN_VOLUME;
	}else {
		this.volume = volume;
		
	}
	System.out.println("현재 tv볼륨 : " + this.volume);
}



	
}
