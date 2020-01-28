package Search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SerchTest {
	@Test
  public void SerchByTennis() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver; 
		driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		//driver.close(); cierra la sesión del browser//
		//driver.quit(); cierra el webdriver//
		driver.findElement(By.id("search_query_top")).sendKeys("tennis");
		driver.findElement(By.name("submit_search")).click();
		
		String textTipeOfResult =  driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
		System.out.println("--------------------->" + textTipeOfResult);
		Assert.assertEquals(textTipeOfResult, "\"0 results have been found\"");
	    driver.close();
	    driver.quit();
  }
}
