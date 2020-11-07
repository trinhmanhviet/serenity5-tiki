package tiki;

import org.openqa.selenium.By;

import net.thucydides.core.pages.PageObject;

public class HomePageAction extends PageObject{
	
	public void typeSearchWord() {
		$(By.xpath("//input[contains(@type,'text')]")).type("Android");
	}
	
	public void clickSearchButton() {
		$(By.xpath("//button[contains(.,'Tìm kiếm')]")).click();
	}

}
