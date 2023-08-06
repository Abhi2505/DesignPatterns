package DesignPattern.ObserverDesignPattern;

public class WeatherData {
	String name;
	String value;
	public WeatherData(String s1,String s2) {
		this.name=s1;
		this.value=s2;
	}
	@Override
	public String toString() {
		return "WeatherData [name=" + name + ", value=" + value + "]";
	}
}
