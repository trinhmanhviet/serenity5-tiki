package tiki;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class LocationPopupAction extends PageObject{
	
	WebElementFacade webElement;
	
	
	public void clickOnChooseLocation() {
		$(By.xpath("//button[@class='apply-btn'][contains(.,'ĐỒNG Ý')]")).click();
	}
	
	public void chooseCity() {
		$(By.xpath("(//select[@class='form-control'])[1]")).selectByVisibleText("Hà Nội");
	}
	
	public void chooseDistrict() {
		$(By.xpath("(//select[@class='form-control'])[2]")).selectByVisibleText("Quận Thanh Xuân");
	}

	public void chooseSubDistrict() {
		$(By.xpath("(//select[@class='form-control'])[3]")).selectByVisibleText("Phường Thanh Xuân Bắc");
	}
	
	public void confirmAddress() {
		$(By.xpath("//button[contains(.,'GIAO ĐẾN ĐỊA CHỈ NÀY')]")).click();
	}

}
