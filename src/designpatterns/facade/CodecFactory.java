package designpatterns.facade;


public class CodecFactory {
	
	public DecompressionCodec extract(VideoFile file) {
		System.out.println("Extracting file: " + file.getFilename());
		// Actual logic here to figure out the correct codec
		boolean someLogic = true;
		if (someLogic) {
			return new OggDecompressionCodec();
		} else {
			return new MPEG4DecompressionCodec();
		}
	}
}

