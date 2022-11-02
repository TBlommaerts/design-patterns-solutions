package designpatterns.facade;


public class VideoFile {
	private String filename;
	
	public VideoFile(String filename) {
		this.filename = filename;
	}
	
	public String getFilename() {
		return filename;
	}
	
	public void save() {
		System.out.println("Storing file to destination: " + filename + ".");
	}
}

