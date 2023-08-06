package DesignPattern.ObserverDesignPattern;

public class DesktopDisplay implements Observor{
	WeatherStation st;
	public DesktopDisplay(WeatherStation ws) {
		// TODO Auto-generated constructor stub
		this.st=ws;
	}
	@Override
	public void update(WeatherData d) {
		st.getWeatherData(d);
	}
//	@Override
//	public String toString() {
//		return "DesktopDisplay [st=" + st + "]";
//	}

}
