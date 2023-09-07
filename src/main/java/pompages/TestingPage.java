package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {

	@FindBy(xpath="//img[@id='Selenium Training']")
	private WebElement seleniumimg;
	
	@FindBy(id="mycart")
	private WebElement cartArea;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebbok;
	
	//initialization
		public TestingPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		
		public void fbicon() {
			facebbok.click();
		}
		
		public WebElement getSeleniumimg() {
			return seleniumimg;
		}

	
		public WebElement getCartArea() {
			return cartArea;
		}

		
		
}
