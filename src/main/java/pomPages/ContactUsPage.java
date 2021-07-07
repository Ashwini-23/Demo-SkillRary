package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	@FindBy(name="name")
	private WebElement nametb;
	
	@FindBy(name="sender")
	private WebElement emailtb;
	
	@FindBy(name="subject")
	private WebElement subjecttb;
	
	@FindBy(name="message")
	private WebElement messagetb;
	
	@FindBy(xpath="//button[text()=\"Send us mail\"]")
	private WebElement sendusmailbtn;
	
	public ContactUsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void nametextbox(String name) {
		nametb.sendKeys(name);
	}
	
	public void emailtextbox(String mail) {
		emailtb.sendKeys(mail);
	}
	
	public void subjecttextbox(String subject) {
		subjecttb.sendKeys(subject);
	}
	public void messagetextbox(String message) {
		messagetb.sendKeys(message);
	}
	public void sendusmailbutton() {
		sendusmailbtn.click();
	}
	

}
