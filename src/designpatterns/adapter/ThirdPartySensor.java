package designpatterns.adapter;

// Third party vendor sensor, class comes from an external library -> We are not able to change this code
public class ThirdPartySensor {
	
	// Return the temperature measured at the given moment in time in degrees Fahrenheit
	public double fetchTemperature(int year, int month, int day, int hour, int minute, int second, int milliseconds) {
		// Dummy value (actual logic should go here instead)
		return 104.0;
	}
}