package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryLoginPage {
	@FindBy(id="course")
	private WebElement coursebtn;
	
	@FindBy(xpath="//a[text()=\"Selenium Training\"]")
	private WebElement SeleniumTrainingbtn;
	
	public DemoSkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void SeleniumTrainingbutton() {
		SeleniumTrainingbtn.click();
	}

	public WebElement getCoursebtn() {
		return coursebtn;
	}

	
	
	

}
