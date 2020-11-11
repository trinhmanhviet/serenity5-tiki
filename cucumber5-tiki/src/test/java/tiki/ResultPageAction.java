package tiki;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import net.thucydides.core.pages.PageObject;

public class ResultPageAction extends PageObject{
	
	WebDriver driver;
	
	public static String oldName;
	

	public void checkOnTikiNow() {
		$(By.xpath("//span[@class='tikicon icon-tikinow-19']")).click();
	}
	
	public void verifyPage() {
		WebDriver driver = getDriver();
	    String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://tiki.vn/search?q=android&support_p2h_delivery=1";
		if(currentUrl.equalsIgnoreCase(expectedUrl)==true) {
			System.out.println("Right page: "+currentUrl);
		}else
		{
			System.out.println("Wrong page");
		}
	}
	
	public void clickOn2thProduct() {
		getOldName();
		$(By.xpath("(//a[@class='search-a-product-item'])[2]")).click();
	}
	
	public void getOldName() {
		$(By.tagName("body")).sendKeys(Keys.ARROW_DOWN);
		$(By.tagName("body")).sendKeys(Keys.ARROW_DOWN);
		$(By.tagName("body")).sendKeys(Keys.ARROW_DOWN);
		//$(By.xpath("//div[@class='filter-list-box']")).sendKeys(Keys.PAGE_DOWN);
		//$(By.xpath("//div[@class='filter-list-box']")).sendKeys(Keys.PAGE_DOWN);
		oldName = $(By.xpath("(//p[@class='title'])[2]")).getText();
	}
	
}
