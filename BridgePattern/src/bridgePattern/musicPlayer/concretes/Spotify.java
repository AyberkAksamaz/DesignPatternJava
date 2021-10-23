package bridgePattern.musicPlayer.concretes;

import bridgePattern.Music;
import bridgePattern.musicPlayer.abstracts.MusicPlayer;

public class Spotify implements MusicPlayer{

	@Override
	public String playMusic(Music music) {
		System.out.println("Spotify is playing " + music);
		return music.getSound();
	}

}
