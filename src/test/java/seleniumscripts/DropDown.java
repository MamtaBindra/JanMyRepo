package seleniumscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {

	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	@Test
	public void dropdowncheck() throws InterruptedException
	{
	
       System.setProperty("webdriver.chrome.driver","C:\\Users\\prave\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ironspider.ca/forms/dropdowns.htm");
		
		//1.select the dropdown
		//select by index or select by visible text
		
		
		WebElement e=driver.findElement(By.xpath("//select[@name='coffee']"));
		Select dd=new Select(e);
		dd.selectByIndex(2);
		Thread.sleep(2000);
		
		dd.selectByVisibleText("With cream & sugar");
		Thread.sleep(3000);
		
		dd.selectByValue("crisp");
		Thread.sleep(3000);
		
		//getoptions is going to fetch all the options that are there in the dropdown
		
		List<WebElement> l=dd.getOptions();
		
			//to print all the values we need to use for each loop
		/*for(WebElement list:l)
		{
			 String value=list.getText();
			 System.out.println("value names" + value);
		//}
		
		//size() is used to get no of values there in dropdown
		*/
		int count=l.size();
		
		for(int i=0;i<count;i++)
		{
		System.out.println(l.get(i).getText());
		}
		
		driver.close();
		
		
	}

}
