import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class MainMethod {
	
	
	
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\\\vagicharla\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mediawiki.org/wiki/MediaWiki");
		Thread.sleep(2000);
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WikiLogin login =PageFactory.initElements(driver,WikiLogin.class);
		//
		login.DoLogin("swami");
		System.out.println("Login Successfully");
		
		
	}

}
