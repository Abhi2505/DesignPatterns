package DesignPattern.AdapterDesignPattern;

public class jsonSoftware implements jsonData {
	//this is a software that understands the json data only
	@Override
	public void readJsonData() {
		System.out.println("understands json data only");
	}

}
