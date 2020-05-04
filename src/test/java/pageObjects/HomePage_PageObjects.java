package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PageObjects {
	 WebDriver driver;

	public HomePage_PageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(xpath = "//a[@class='btn btn-block btn-social btn-yahoo']")
	WebElement continuewithFB;
	public WebElement continuewithFB() {
		return continuewithFB;
	}

}
