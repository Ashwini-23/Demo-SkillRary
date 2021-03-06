package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	@FindBy(id="add")
	private WebElement plusbtn;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement AddToCartbtn;
	
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getPlusbtn() {
		return plusbtn;
	}
	
	public void AddToCartbutton() {
		AddToCartbtn.click();
	}

	
}
