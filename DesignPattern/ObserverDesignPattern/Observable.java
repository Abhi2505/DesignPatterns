package DesignPattern.ObserverDesignPattern;

public interface Observable {
	public void addObservor(Observor obj);
	public void removeObservor(Observor obj);
	public void notifyObservor(WeatherData d);
}
