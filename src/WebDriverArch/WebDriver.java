package WebDriverArch;

public abstract class WebDriver {
	
	public abstract void get(String url);
	public abstract void findElement(String element);
	public abstract String getTitle();
	public void quit() {
		System.out.println("close the browser ");
	}

	
}
