package scripts;

import java.io.IOException;

import javax.swing.text.Utilities;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pompages.AddtocartPage;
import pompages.Skillraryloginpage;
import pompages.TestingPage;
import pompages.skillraryDemologinPage;

public class TestCase2 extends BaseClass {
	
	@Test
	public void TC2() throws InterruptedException, IOException {
		Skillraryloginpage s=new Skillraryloginpage(driver);
		Thread.sleep(3000);
		s.gearbutton();
		Thread.sleep(3000);
		s.skillrarydemoapplication();
		utilties.switchingTab(driver);
		skillraryDemologinPage sd=new skillraryDemologinPage(driver);
		Thread.sleep(3000);
		
		utilties.dropdown(sd.getCoursedropdown(), pdata.getPropertydata("coursedd"));
		TestingPage t=new TestingPage(driver);
		utilties.dragDrop(driver, t.getSeleniumimg(), t.getCartArea());
		
	}

}
