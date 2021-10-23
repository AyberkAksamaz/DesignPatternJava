package bridgePattern.recorder.concretes;

import bridgePattern.recorder.abstracts.Recorder;

public class Speaker implements Recorder{

	@Override
	public void playSound(String sound) {
		System.out.println("Speaker playing sound -> " + sound);
	}

}
