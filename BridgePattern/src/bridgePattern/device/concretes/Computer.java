package bridgePattern.device.concretes;

import bridgePattern.Music;
import bridgePattern.device.abstracts.MusicDevice;
import bridgePattern.musicPlayer.abstracts.MusicPlayer;
import bridgePattern.recorder.abstracts.Recorder;

public class Computer extends MusicDevice{

	public Computer(Recorder recorder, MusicPlayer musicPlayer) {
		super(recorder, musicPlayer);
	}
	
	public void  playMusic(Music music) {
		System.out.println("Computer running...");
		super.playMusic(music);
	}

}
