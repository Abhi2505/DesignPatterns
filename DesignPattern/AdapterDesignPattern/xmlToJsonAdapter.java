package DesignPattern.AdapterDesignPattern;

public class xmlToJsonAdapter implements jsonData{
	XMLData xmldata;
	public xmlToJsonAdapter(XMLData xml) {
		// TODO Auto-generated constructor stub
		this.xmldata=xml;
	}
	@Override
	public void readJsonData() {
		xmldata.readXMLdata();
		System.out.println("convert the xml to json");
	}

}
