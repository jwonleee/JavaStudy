package chapter7;

public class Exercise7_10 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
		
		t.setChannel(20);
		
	}
}


class MyTv2 {
	private boolean isPowerOn;
	private int		channel;
	private int		volume;
	public int rewind;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(MIN_CHANNEL <= channel && channel <= MAX_CHANNEL) {
			this.channel = channel;
			rewind = channel;
		} else {
			System.out.println("올바른 채널을 입력하세요");
		}
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(MIN_VOLUME <= volume && volume <= MAX_VOLUME) {
			this.volume = volume;
		} else {
			System.out.println("볼륨의 범위를 벗어났습니다");
		}
	}
	
	public void gotoPrevChannel() {
		this.channel = rewind;
	}
	
	
}
