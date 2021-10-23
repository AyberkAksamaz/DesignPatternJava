package bridgePattern.recorder.concretes;

import bridgePattern.recorder.abstracts.Recorder;

public class Headset implements Recorder{

	@Override
	public void playSound(String sound) {
		System.out.println("Headset playing sound -> " + sound);
	}

}
