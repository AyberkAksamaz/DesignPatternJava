package bridgePattern;

import bridgePattern.device.concretes.Computer;
import bridgePattern.device.concretes.Phone;
import bridgePattern.musicPlayer.concretes.Fizzy;
import bridgePattern.musicPlayer.concretes.Spotify;
import bridgePattern.recorder.concretes.Headset;
import bridgePattern.recorder.concretes.Speaker;

public class Main {

	public static void main(String[] args) {
		Music music = new Music("ACDC", "Thunder!!!");
		Computer computer = new Computer(new Speaker(), new Spotify());
		computer.playMusic(music);
		System.out.println("********************");
		Phone phone = new Phone(new Headset(), new Fizzy());
		phone.playMusic(music);
		
	}

}
