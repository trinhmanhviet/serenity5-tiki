package tiki;

import net.thucydides.core.annotations.Step;

public class ProductDetailPage {
	
	ProductDetailAction productDetailAction;
	
	@Step
	public void verifyTheProduct() {
		productDetailAction.verifyProduct();
	}
	
	@Step
	public void addToCart() throws Exception {
		productDetailAction.addToCart();
	}

}
