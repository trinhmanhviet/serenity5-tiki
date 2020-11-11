package tiki;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

public class ProductDetailAction extends PageObject{
	
	ResultPageAction oldProduct;
	
	
	public boolean verifyProduct() {
		if(getNewNameToCompare().equalsIgnoreCase(ResultPageAction.oldName)==true) {
			System.out.println("Right product: "+getNewName());
			return true;
		}else {
			System.out.println("Wrong product. It should be "+ResultPageAction.oldName+"...");
			return false;
		}
	}
	
	public String getNewName() {
		String newName = $(By.xpath("//h1[@class='title']")).getText();
		return newName;
	}
	
	public String getNewNameToCompare() {
		String newNameToCompare = $(By.xpath("//h1[@class='title']")).getText();
		if(newNameToCompare.length()>25){
			newNameToCompare = newNameToCompare.substring(0, 25);
		}else {
			newNameToCompare = newNameToCompare.substring(0, 15);
		}
		return newNameToCompare;
	}
	
	public void addToCart() throws Exception {
		if(verifyProduct()==true) {
			$(By.tagName("body")).sendKeys(Keys.ARROW_DOWN);
			int quantity = Integer.parseInt($(By.xpath("//input[@class='input']")).getValue());
			if(quantity==1){
				$(By.xpath("//img[contains(@src,'v2/icons-add.svg')]")).click();
			}else {
				throw new Exception();
			}
		}
	}

}
