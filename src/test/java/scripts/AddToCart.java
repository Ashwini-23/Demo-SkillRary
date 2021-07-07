package scripts;
import org.testng.annotations.Test;

import genericlib.baseClass;
import pomPages.AddToCartPage;
import pomPages.DemoSkillraryLoginPage;
import pomPages.SkillRaryLoginPage;

public class AddToCart extends baseClass{
	@Test
	public void addProduct() {
		SkillRaryLoginPage slp = new SkillRaryLoginPage(driver);
		slp.gearsbutton();
		slp.skillrarydemobutton();
		
		w.switchTab(driver);
		
		DemoSkillraryLoginPage lp = new DemoSkillraryLoginPage(driver);
		w.mouseOver(driver, lp.getCoursebtn());
		lp.SeleniumTrainingbutton();
		
		AddToCartPage cp = new AddToCartPage(driver);
		w.doubleClick(driver, cp.getPlusbtn());
				cp.AddToCartbutton();
				w.alertPopup(driver);
				
	}
	
	

}
