package DesignPattern.ObserverDesignPattern;

public class Main {
public static void main(String[] args) {
	WeatherStation wstation = new WeatherStation();
	PhoneDisplay obs1=new PhoneDisplay(wstation);
	DesktopDisplay obs2=new DesktopDisplay(wstation);
	wstation.addObservor(obs1);
	wstation.addObservor(obs2);
	wstation.addData(new WeatherData("Temperature","12 degree C" ));
//	wstation.addData(new WeatherData("Temperature","13 degree C" ));
//	wstation.addData(new WeatherData("Temperature","22 degree C" ));
//	wstation.addData(new WeatherData("Temperature","1 degree C" ));
//	wstation.addData(new WeatherData("Windspeed","23" ));
//	wstation.addData(new WeatherData("Windspeed","33" ));

	
}
}
