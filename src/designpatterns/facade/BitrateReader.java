package designpatterns.facade;


public class BitrateReader {
	
	public static byte[] read(String filename, DecompressionCodec sourceCodec) {
		System.out.println("Reading file: " + filename + " using codec.");
		// Dummy value
		return new byte[] {};
	}
	
	public static VideoFile convert(String filename, byte[] buffer, CompressionCodec destinationCodec) {
		System.out.println("Converting buffer to the destination format.");
		return new VideoFile(filename);
	}
}

