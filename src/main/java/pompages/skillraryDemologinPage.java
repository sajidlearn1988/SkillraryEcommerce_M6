package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillraryDemologinPage {
	@FindBy(xpath="//a[@id='course']")
	private WebElement couresTab;
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement Seleniumcourse;
	
	@FindBy(xpath="//select[@name='addresstype']")
	private WebElement Coursedropdown;
	
	
	//initialization
		public skillraryDemologinPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		public void SeleniumTraining() {
			Seleniumcourse.click();
		}

		public WebElement getCouresTab() {
			return couresTab;
		}


		public WebElement getCoursedropdown() {
			return Coursedropdown;
		}


	

}
