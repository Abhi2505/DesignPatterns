package DesignPattern.ObserverDesignPattern;
import java.util.*;

public class WeatherStation implements Observable {
	List<Observor>list=new ArrayList<>();
	List<WeatherData>data=new ArrayList<>();
	public void addData(WeatherData d) {
		data.add(d);
		//System.out.println(data);
		this.notifyObservor(d);
	}
	@Override
	public void addObservor(Observor obj) {
		this.list.add(obj);
		
	}

	@Override
	public void removeObservor(Observor obj) {
		this.list.remove(obj);
	}

	@Override
	public String toString() {
		return "WeatherStation [list=" + list + ", data=" + data + "]";
	}
	@Override
	public void notifyObservor(WeatherData d) {
		//System.out.println("here");
		 for(Observor obs:list) {
			 //all the observors are notified when something weather data
			 //is updated in the weather
			 //station
			 System.out.println(obs);
			obs.update(d);
		}
	}
	public void getWeatherData(WeatherData d) {
		System.out.println("data is "+d);
	}

}
