package designpatterns.facade;


public class AudioMixer {
	
	public VideoFile fix(VideoFile input) {
		System.out.println("Fixing audio in file: " + input.getFilename() + ".");
		return input;
	}
}

