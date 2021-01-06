package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//1st frame:PackageList Frame
		//2nd Frame:PackageFrame
		//3rd Frame:ClassFrame
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prave\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		//switch to frame 1
		//click on link
		//switch back to default window
		//switch to frame 3
		//click on link
		driver.switchTo().frame("packageListFrame");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("org.openqa.selenium.cli")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("classFrame");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("org.openqa.selenium.chromium")).click();
		Thread.sleep(2000);
		
		
		//driver.switchTo().frame

	}

}
