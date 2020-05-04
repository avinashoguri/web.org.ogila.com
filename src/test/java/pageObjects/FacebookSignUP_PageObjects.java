package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUP_PageObjects {
	WebDriver driver;

	public FacebookSignUP_PageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}


	@FindBy(name = "firstname")
	WebElement firstname;
	public WebElement firstname() {
		return firstname;
	}

	@FindBy(name = "lastname")
	WebElement surname;
	public WebElement surname() {
		return surname;
	}

	@FindBy(name = "reg_email__")
	WebElement email;
	public WebElement email() {
		return email;
	}
	@FindBy(name = "reg_email_confirmation__")
	WebElement reenter_email;
	public WebElement reenter_email() {
		return reenter_email;
	}

	@FindBy(name = "reg_passwd__")
	WebElement newPassword;
	public WebElement newPassword() {
		return newPassword;
	}

	@FindBy(xpath="//select[@id='day']")
	WebElement date_dropdown;

	public void select_day(String date){
		Select dateDropdown=new Select(date_dropdown);
		dateDropdown.selectByVisibleText(date);
	}
	@FindBy(xpath="//select[@id='month']")
	WebElement mounth_dropdown;

	public void select_mounth(String mounth){
		Select mounthDropdown=new Select(mounth_dropdown);
		mounthDropdown.selectByVisibleText(mounth);
	}

	@FindBy(xpath="//select[@id='year']")
	WebElement year_dropdown;

	public void select_year(String year){
		Select yearDropdown=new Select(year_dropdown);
		yearDropdown.selectByVisibleText(year);
	}
	@FindBy(id = "u_0_6")
	WebElement female;
	public WebElement female() {
		return female;
	}
	@FindBy(id = "u_0_7")
	WebElement male;
	public WebElement male() {
		return male;
	}
	@FindBy(id = "u_0_8")
	WebElement custom;
	public WebElement custom() {
		return custom;
	}

	@FindBy(id = "u_0_13")
	WebElement signup;
	public WebElement signup() {
		return signup;
	}
}





