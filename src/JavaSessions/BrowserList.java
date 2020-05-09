package JavaSessions;

import java.util.ArrayList;

public class BrowserList {
	
	String browserName;
	String vendorName;
	int version;
	ArrayList<String> pluginList;
	
	public BrowserList(String browserName, ArrayList<String> pluginList) {
		this.browserName = browserName;
		this.pluginList = pluginList;
	}

	public BrowserList(String browserName, String vendorName) {
		this.browserName = browserName;
		this.vendorName = vendorName;
	}

	public BrowserList(String browserName, String vendorName, int version, ArrayList<String> pluginList) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.version = version;
		this.pluginList = pluginList;
	}

	public static void main(String[] args) {
		ArrayList<String> plugins1=new ArrayList<String>();
		plugins1.add("Adobe");
		plugins1.add("Google talk");
		plugins1.add("VLC web");
		plugins1.add("Remote desktop");
		
		ArrayList<String> plugins2=new ArrayList<String>();
		plugins2.add("Quicktime");
		plugins2.add("flash");
		
		BrowserList b1= new BrowserList("chrome","google",81,plugins1);
		BrowserList b2= new BrowserList("IE","windows");
		BrowserList b3=new BrowserList("firefox",plugins2);
		System.out.println(b2.browserName+" "+b2.vendorName);
		System.out.println(b1.browserName+" "+b1.vendorName+" "+b1.version+" "+b1.pluginList);
		System.out.println(b3.browserName+" "+b3.pluginList);
		
		
	}

}
