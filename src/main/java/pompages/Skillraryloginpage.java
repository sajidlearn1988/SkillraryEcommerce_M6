package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillraryloginpage {
	//Declaration
	//address of gear
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearbtn;
	
	//address of skillrary demo
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	//address of search text field
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchtb;
	
	//address of search icon
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;
	
	//initialization
	public Skillraryloginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public void gearbutton() {
		gearbtn.click();
	}
	
	public void skillrarydemoapplication() {
		skillrarydemoapp.click();
	}
	
	public void searchTeaxtBox(String name) {
		searchtb.sendKeys(name);
	}
	
	public void gobutton() {
		searchbtn.click();
	}
		

}
