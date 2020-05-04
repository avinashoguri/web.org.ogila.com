package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage_PageObjects {
	 WebDriver driver;

		public FacebookPage_PageObjects(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		
		}
		
		
		@FindBy(linkText = "Create New Account")
		WebElement buttonCreate;
		public WebElement buttonCreate() {
			return buttonCreate;
		}


}
