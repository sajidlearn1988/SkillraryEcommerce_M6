package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {

	@FindBy(xpath="//button[@id='add']")
	private WebElement addbtn;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtoCartbtn;
	
	
	//initialization
			public AddtocartPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}

			
			public void AddtoCartbtn() {
				addtoCartbtn.click();
			}
			
			
			public WebElement getAddbtn() {
				return addbtn;
			}



}
