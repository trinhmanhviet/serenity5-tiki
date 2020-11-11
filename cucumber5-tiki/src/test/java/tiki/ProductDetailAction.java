package tiki;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

public class ProductDetailAction extends PageObject{
	
	ResultPageAction oldProduct;
	
	
	public void verifyProduct() {
		if(getNewName().equalsIgnoreCase(ResultPageAction.oldName)==true) {
			System.out.println("Right product: "+getNewName());
		}else {
			System.out.println("Wrong product. It should be "+ResultPageAction.oldName);
		}
	}
	
	public String getNewName() {
		return $(By.xpath("//h1[@class='title']")).getText();
		
	}

}
