package org.loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Canadapost {
	private static String title;

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\manje\\eclipse-workspace\\Canadapost\\driver\\chromedriver.exe");
	WebDriver Driver= new ChromeDriver();
	 Driver.get("https://www.canadapost-postescanada.ca/cpc/en/home.page");
	String title= Driver.getTitle();
	System.out.println(Driver.getCurrentUrl());
	System.out.println(title);
	System.out.println(Driver.getPageSource());
Driver.get("https://www.google.com/");
Driver.manage().deleteAllCookies();
Driver.manage().deleteAllCookies();
Driver.manage().window().maximize();
Thread.sleep(7000);
Driver.close();
Driver.quit();
}
}
