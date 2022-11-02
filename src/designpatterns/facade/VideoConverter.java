package designpatterns.facade;


public class VideoConverter {
	
	public VideoFile convert(String filename, String format) {
		
		VideoFile file = new VideoFile(filename);
		
		DecompressionCodec sourceCodec = new CodecFactory().extract(file);
		
		CompressionCodec destinationCodec;
		if (format.equals("mp4")) {
			destinationCodec = new MPEG4CompressionCodec();
		} else {
			destinationCodec = new OggCompressionCodec();
		}
		
		byte[] buffer = BitrateReader.read(filename, sourceCodec);
		VideoFile result = BitrateReader.convert(filename, buffer, destinationCodec);
		
		return new AudioMixer().fix(result);
	}
}

