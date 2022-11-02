package designpatterns.adapter;

import java.time.LocalDateTime;

public class HeatChecker {
	
	private static final double MAX_TEMPERATURE = 80;
	
	// Returns true if a sensor's temperature (in degrees Celsius) was higher than the maximum temperature on the given date and time.
	public boolean isOverheated(ITemperatureSensor sensor, LocalDateTime dateTime) {
		return sensor.getTemperature(dateTime) > MAX_TEMPERATURE;
	}
}