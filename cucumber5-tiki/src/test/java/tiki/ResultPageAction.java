package tiki;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.thucydides.core.pages.PageObject;

public class ResultPageAction extends PageObject{
	
	//public String oldProductName = $(By.xpath("(//p[@class='title'])[5]")).getText();


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
	
	public void clickOn5thProduct() {
		$(By.xpath("(//a[@class='search-a-product-item'])[5]")).click();
	}
	
}
