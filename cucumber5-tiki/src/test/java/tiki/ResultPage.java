package tiki;

import net.thucydides.core.annotations.Step;

public class ResultPage{
	
	ResultPageAction resultPageAction;
	
	@Step
	public void clickOnTikiNow() {
		resultPageAction.checkOnTikiNow();
	}
	
	@Step
	public void verifyPage() {
		resultPageAction.verifyPage();
	}
	
	@Step
	public void chooseThe5thProduct() {
		resultPageAction.clickOn5thProduct();
	}

}
