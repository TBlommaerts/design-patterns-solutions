package designpatterns.facade;


public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * We are using a complex third party video conversion framework to convert two video files to a new format and fix the audio.
		 */
		VideoConverter converter = new VideoConverter();
		
		VideoFile mp4 = converter.convert("MPEG4-video.ogg", "mp4");
		mp4.save();
		
		VideoFile ogg = converter.convert("Ogg-video.ogg", "ogg");
		ogg.save();
	}
}