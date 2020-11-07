package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import tiki.HomePage;
import tiki.LocationPopup;
import tiki.ResultPage;

public class SearchOnTikiStep {
	
	@Steps
	HomePage homePage;
	
	@Steps
	LocationPopup locationPopup;
	
	@Steps
	ResultPage resultPage;
	

	
	@Given("Viet is on the tiki home page")
	public void viet_is_on_the_tiki_home_page() {
		homePage.openHomePage();
	}
	
	@When("he searches for {string}")
	public void he_searches_for_android(String string) {
		homePage.searchForAndroid();
	}

	@And("he tick on tikinow checkbox")
	public void he_tick_on_tikinow_checkbox() {
		resultPage.clickOnTikiNow();
	}

	@And("he chooses his location")
	public void he_chooses_his_location() {
		locationPopup.chooseLocation();
	}

	@Then("he should be back to search result page")
	public void he_should_be_back_to_search_result_page() {
		resultPage.verifyPage();
	}

	
}
