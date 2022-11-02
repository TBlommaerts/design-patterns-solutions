package designpatterns.adapter;

import java.time.LocalDateTime;

public class Sensor2 implements ITemperatureSensor {

	// Return the temperature measured at the given moment in time in degrees Celsius
	@Override
	public double getTemperature(LocalDateTime dateTime) {
		
		// Dummy value (actual logic should go here instead)
		return 89.82;
	}
}