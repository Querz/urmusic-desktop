package io.github.nasso.urmusic.audio.javasound;

import java.io.File;

import io.github.nasso.urmusic.TaskProperties;
import io.github.nasso.urmusic.Urmusic;
import io.github.nasso.urmusic.audio.AudioEngine;
import io.github.nasso.urmusic.audio.Sound;

public class JavaSoundAudioEngine implements AudioEngine {
	public Sound loadSound(File f, TaskProperties props) {
		// TODO: implement TaskProperties for Java Sound audio engine
		try {
			JSound sound = new JSound(f);
			return sound;
		} catch(Exception e) {
			if(Urmusic.DEBUG) e.printStackTrace();
			return null;
		}
	}
}
