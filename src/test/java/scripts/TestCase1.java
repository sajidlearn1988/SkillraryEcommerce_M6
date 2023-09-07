package scripts;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pompages.AddtocartPage;
import pompages.Skillraryloginpage;
import pompages.skillraryDemologinPage;

public class TestCase1 extends BaseClass{
	
	@Test
	public void TC1() throws InterruptedException {
		Skillraryloginpage s=new Skillraryloginpage(driver);
		Thread.sleep(3000);
		s.gearbutton();
		Thread.sleep(3000);
		s.skillrarydemoapplication();
		utilties.switchingTab(driver);
		skillraryDemologinPage sd=new skillraryDemologinPage(driver);
		Thread.sleep(3000);
		utilties.mouseHover(driver, sd.getCouresTab());
		sd.SeleniumTraining();
		Thread.sleep(3000);
		AddtocartPage d=new AddtocartPage(driver);
		utilties.doubleClick(driver, d.getAddbtn());
		d.AddtoCartbtn();
		Thread.sleep(3000);
		utilties.alertPopup(driver);
		
		
	}

}
