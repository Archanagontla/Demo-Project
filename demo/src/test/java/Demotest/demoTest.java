package Demotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demoTest {

	@Test
	public void m1()
	{
		// TODO Auto-generated method stub

				
		//search  the product
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.automationexercise.com/");
				System.out.println(driver.getTitle());
				try
				{
					Thread.sleep(5000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
					
				}
				driver.close();
				

	}

}
