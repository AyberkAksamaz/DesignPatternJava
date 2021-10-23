package bridgePattern.device.concretes;

import bridgePattern.Music;
import bridgePattern.device.abstracts.MusicDevice;
import bridgePattern.musicPlayer.abstracts.MusicPlayer;
import bridgePattern.recorder.abstracts.Recorder;

public class Phone extends MusicDevice{

	public Phone(Recorder recorder, MusicPlayer musicPlayer) {
		super(recorder, musicPlayer);
	}
	
	public void  playMusic(Music music) {
		System.out.println("Phone running...");
		super.playMusic(music);
	}
	
}
