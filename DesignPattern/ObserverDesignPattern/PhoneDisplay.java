package DesignPattern.ObserverDesignPattern;

public class PhoneDisplay implements Observor{
	WeatherStation w;
	public PhoneDisplay(WeatherStation wstation) {
		this.w=wstation;
	}
	@Override
	public void update(WeatherData d) {
		// TODO Auto-generated method stub
		this.w.getWeatherData(d);
	}
//	@Override
//	public String toString() {
//		return "PhoneDisplay [w=" + w + "]";
//	}

}
