package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class seleniumPage {
	
	@FindBy(xpath="//a[@title=\"Core Java For Selenium Training\"]")
	private WebElement corejavacoursel;
	
	public seleniumPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void corejavacourselink() {
		corejavacoursel.click();
	}
	

}
