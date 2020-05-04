package stepDefenations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.FacebookPage_PageObjects;
import pageObjects.FacebookSignUP_PageObjects;
import pageObjects.HomePage_PageObjects;
import resources.Base;
import cucumber.api.java.en.Then;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cucumber.api.java.en.And;

public class SignUp_StepDefenation extends Base{

	public static Logger log =LogManager.getLogger(SignUp_StepDefenation.class.getName());



	@Given("^: User is on OGILA Home page$")
	public void _user_is_on_ogila_home_page() throws Throwable {
		try
		{
			driver=initializeDriver();
			driver.get("https://www.ogila.com/");
			String Title=driver.getTitle();
			//System.out.println(Title);
			Assert.assertEquals(Title,"OGILA");
			log.info("User is on OGILA page");
		}catch(Exception e) {
			log.error(e);
		}
	}

	@When("^: Click on Continue with Facebook$")
	public void _click_on_continue_with_facebook() throws Throwable {
		try
		{

			HomePage_PageObjects hp=new HomePage_PageObjects(driver);
			hp.continuewithFB().click();
			log.info("Continue with facebook button clicked");
		}catch(Exception e) {
			log.error("Continue with facebook button not clicked");
		}
	}

	@Then("^: Facebook login page will display and click on create account$")
	public void _facebook_login_page_will_display_and_click_on_create_account() throws Throwable {

		try {
			FacebookPage_PageObjects fb=new FacebookPage_PageObjects(driver);
			String fbTitle=driver.getTitle();
			System.out.println(fbTitle);
			//Assert.assertEquals(fbTitle,"Facebook");
			log.info("user is on facebook page");

			fb.buttonCreate().click();
			log.info("create account button clicked");
		}catch(Exception e) {
			log.error("create account button not clicked");
		}
	}

	@Then("^: Fill the \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
	public void _fill_the_somethingsomethingsomethingandsomething(String firstname, String surname, String email, String newpassword) throws Throwable {

		FacebookSignUP_PageObjects fs=new FacebookSignUP_PageObjects(driver);
		try {
			fs.firstname().sendKeys(firstname);
			log.info("firstname entered");
			fs.surname().sendKeys(surname);
			log.info("surname entered");
			fs.email().sendKeys(email);
			log.info("email entered");
			fs.reenter_email().sendKeys(email);
			log.info("email re-entered");
			fs.newPassword().sendKeys(newpassword);
			log.info("newpassword entered");
			
		}catch(Exception e) {
			log.error("check name or email or password are not entered");
		}

	}

	@And("^: fill Date of birth , \"([^\"]*)\" and click on SignUP$")
	public void _fill_date_of_birth_something_and_click_on_signup(String gender) throws Throwable {

		FacebookSignUP_PageObjects fs=new FacebookSignUP_PageObjects(driver);

		try {
			fs.select_day("9");
			fs.select_mounth("May");
			fs.select_year("1990");
			log.info("DOB selected");
			if(gender.equals("male")) {
				fs.male().click();
				log.info("male selected");				
			}else if(gender.equals("female")) {
				fs.female().click();
				log.info("female selected");				
			}else if(gender.equals("custom")) {
				fs.custom().click();
				log.info("others selected");				
			}
			
			fs.signup();
			log.info("Signup button clicked");

		}catch(Exception e) {
			log.error("check details are not selected");
		}

	}
	
	 @And("^: Enter OTP manuvally$")
	    public void _enter_otp_manuvally() throws Throwable {
	       Thread.sleep(10000);
	       // enter OTP from registered email.
	    }



}
