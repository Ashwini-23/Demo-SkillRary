package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericlib.baseClass;
import pomPages.ContactUsPage;
import pomPages.SkillRaryLoginPage;

public class ContactUs extends baseClass {
	@Test
	
	public void contactDetails() throws IOException, InterruptedException {
		
		SkillRaryLoginPage slp = new SkillRaryLoginPage(driver);
		Point loc = slp.getContactusbtn().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		w.scrollBar(driver, x, y);
		Thread.sleep(3000);
		slp.contactusbutton();
		
		
		ContactUsPage cup= new ContactUsPage(driver);
		cup.nametextbox(p.getData("name"));
		cup.emailtextbox(p.getData("email"));
		cup.subjecttextbox("subject");
		cup.messagetextbox(p.getData("message"));
		cup.sendusmailbutton();
		
		
		
		
	}

}
