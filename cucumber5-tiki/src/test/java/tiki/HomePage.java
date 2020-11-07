package tiki;

import net.thucydides.core.annotations.Step;

public class HomePage {
	
	HomePageAction homeAction;
	
	
	@Step
	public void openHomePage() {
		homeAction.open();
	}
	
	@Step
	public void searchForAndroid() {
		homeAction.typeSearchWord();
		homeAction.clickSearchButton();
	}
	
	
}
