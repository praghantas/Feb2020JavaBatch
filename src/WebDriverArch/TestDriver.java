package WebDriverArch;

import java.util.Scanner;

public class TestDriver {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		String browser="chrome";
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("enter the browser name you want to launch: ");
	//	String browser=sc.nextLine(); 
	//	System.out.println("the browser name you entered is: "+browser);
		
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FIrefoxDriver();
		}else if (browser.equalsIgnoreCase("IE")) {
			driver = new IeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FIrefoxDriver();	
		}
		
		driver.get("http://www.google.com");
		driver.findElement("username");
		driver.findElement("password");
		driver.findElement("login");

		System.out.println(driver.getTitle());
		 driver.quit();
	}
}
	


