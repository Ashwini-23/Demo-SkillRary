package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericlib.baseClass;
import pomPages.SkillRaryLoginPage;
import pomPages.seleniumPage;
import pomPages.seleniumTrainingPage;

public class TakeThisCourse extends baseClass {
	
	@Test
	public void getCourse() throws FileNotFoundException, IOException, InterruptedException {
		SkillRaryLoginPage slp = new SkillRaryLoginPage(driver);
		slp.searchtextbox(p.getData("search"));
		slp.searchbutton();
		
		seleniumPage sp = new seleniumPage(driver);
		sp.corejavacourselink();
		
		seleniumTrainingPage stp = new seleniumTrainingPage(driver);
		w.switchFrame(driver);
		stp.playbutton();
		Thread.sleep(10000);
		stp.pausebutton();
		w.switchBack(driver);
		stp.takethiscoursebutton();
				
				
		
	}

}
