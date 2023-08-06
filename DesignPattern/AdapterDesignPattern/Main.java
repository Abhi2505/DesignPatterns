package DesignPattern.AdapterDesignPattern;

public class Main {
public static void main(String[] args) {
	XMLData xmldata=new xmlSoftware();
	jsonData xmlAdapter=new xmlToJsonAdapter(xmldata);
	xmlAdapter.readJsonData();	
//A company hired n interns, labelled from 1 to N. 
//Each intern is given a device which generates a number
//everyday that will be used as a password for their authentication at the office door every day in the morning. The internship is for 50 days starting from 0 to 49.. Initially on the 1st day , the number in the deivice on the Kth intern be equal to (5000*k). From the 2nd day , day(i)=day(i-1)+5000+i;
//Find the label of the intern from the given password used by him
}
}
