package silver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sample {
	public static String url = "http://www.instagram.com/sanghvi_car_shoppe";
@Test
	public void test() {
	
	//public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\vagicharla\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		long start = System.currentTimeMillis();
		driver.get(url);
		long finish = System.currentTimeMillis();
		long total = (finish - start) / 1000;
		System.out.println("load time:" + total + "seconds");
		if (total > 10)
			System.out.println("page loading time more exceed");
		else
			System.out.println("run");
		driver.close();
	}

}

