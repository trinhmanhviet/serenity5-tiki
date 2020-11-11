package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import tiki.HomePage;
import tiki.LocationPopup;
import tiki.ProductDetailPage;
import tiki.ResultPage;

public class SearchOnTikiStep {
	
	@Steps
	HomePage homePage;
	
	@Steps
	LocationPopup locationPopup;
	
	@Steps
	ResultPage resultPage;
	
	@Steps
	ProductDetailPage productPage;
	

	
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

	@And("he should be back to search result page")
	public void he_should_be_back_to_search_result_page() {
		resultPage.verifyPage();
	}
	
	@And("he choose the 2th product")
	public void he_choose_the_2th_product() {
		resultPage.chooseThe2thProduct();
	}
	
	@And("he verify the product")
	public void he_verify_the_product() {
		productPage.verifyTheProduct();
	}
	
	@Then("if the produce is right, he add {int} of them to cart")
	public void if_the_produce_is_right_he_add_of_them_to_cart(Integer int1) throws Exception {
		productPage.addToCart();
	}

	
}
