package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrderingMobile {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://dev140572.service-now.com");
		driver.switchTo().frame(0);
		WebElement uname=driver.findElement(By.id("user_name"));
		uname.sendKeys("admin");
		WebElement pass=driver.findElement(By.id("user_password"));
		pass.sendKeys("P-qQ7@umSYz8");
		WebElement Button=driver.findElement(By.id("sysverb_login"));
		Button.click();
		driver.switchTo().defaultContent();
		WebElement inc=driver.findElement(By.id("filter"));
		inc.sendKeys("service catalog");
		WebElement clk=driver.findElement(By.xpath("(//div[text()='Service Catalog'])[1]"));
		clk.click();
		driver.switchTo().frame(0);
		WebElement mobile=driver.findElement(By.xpath("(//td[@class='homepage_category_only_image_cell']//img[@alt='Mobiles'])"));
		mobile.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		WebElement iphone=driver.findElement(By.xpath("(//div[@style='margin-right: 5px;'])[1]"));
		iphone.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		
		
		WebElement order=driver.findElement(By.xpath("//button[@name='oi_order_now_button']"));
		order.click();
		WebElement text=driver.findElement(By.xpath("//a[@id='requesturl']/b"));
		String text1=text.getText();
		System.out.println(text1);
		WebElement verify=driver.findElement(By.xpath("//span[text()='Thank you, your request has been submitted']"));
		String veriify=verify.getText();
		System.out.println(veriify);

		
	}

}
