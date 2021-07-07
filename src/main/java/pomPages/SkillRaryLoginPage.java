package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryLoginPage {
	@FindBy(xpath="//a[text()=\" GEARS \"]")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=\" SkillRary Demo APP\"])[2]")
	private WebElement skillrarydemobtn;
	
	@FindBy(xpath="//a[text()=\"Contact Us\"]")
		private WebElement contactusbtn;
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	private WebElement searchbtn;
	
	
	
	public SkillRaryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void gearsbutton() {
		// TODO Auto-generated method stub
		gearsbtn.click();
	}

	public void skillrarydemobutton() {
		// TODO Auto-generated method stub
		skillrarydemobtn.click();
	}
	
	public void contactusbutton() {
		contactusbtn.click();
	}
	
	public WebElement getContactusbtn() {
		return contactusbtn;
	}
	
	public void searchtextbox(String key) {
		searchtb.sendKeys(key);
	}
	
	public void searchbutton() {
		searchbtn.click();
	}

}
