package bridgePattern.device.abstracts;

import bridgePattern.Music;
import bridgePattern.musicPlayer.abstracts.MusicPlayer;
import bridgePattern.recorder.abstracts.Recorder;

public abstract class MusicDevice {

	protected Recorder recorder;
	protected MusicPlayer musicPlayer;
	
	public MusicDevice() {
		
	}
	
	public MusicDevice(Recorder recorder, MusicPlayer musicPlayer) {
		this.recorder = recorder;
		this.musicPlayer = musicPlayer;
	}
	
	public void playMusic(Music music) {
		String sound = musicPlayer.playMusic(music);
		recorder.playSound(sound);
	}
}
