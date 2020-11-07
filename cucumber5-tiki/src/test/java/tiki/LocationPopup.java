package tiki;

import net.thucydides.core.annotations.Step;

public class LocationPopup {
	
	LocationPopupAction locationPopupAction;
	
	
	@Step
	public void chooseLocation() {
		locationPopupAction.clickOnChooseLocation();
		locationPopupAction.chooseCity();
		locationPopupAction.chooseDistrict();
		locationPopupAction.chooseSubDistrict();
		locationPopupAction.confirmAddress();
	}

}
