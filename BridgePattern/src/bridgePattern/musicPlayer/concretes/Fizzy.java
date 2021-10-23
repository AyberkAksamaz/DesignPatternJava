package bridgePattern.musicPlayer.concretes;

import bridgePattern.Music;
import bridgePattern.musicPlayer.abstracts.MusicPlayer;

public class Fizzy implements MusicPlayer{

	@Override
	public String playMusic(Music music) {
		System.out.println("Fizzy is playing " + music);
		return music.getSound();
	}

}
