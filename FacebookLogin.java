package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().fullscreen();
		
		driver.findElement(By.id("email")).sendKeys("madhusudannatarajan7@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("maddyrb1128");
	    driver.findElement(By.name("login")).click();
	}

}
