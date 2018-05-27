package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EnterAccountDetailsPage extends ProjectMethods {

	public EnterAccountDetailsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="country")
	private WebElement eleCountry;

	@FindBy(how=How.ID,using="email")
	private WebElement eleEmail;

	@FindBy(how=How.ID,using="password")
	private WebElement elepassword;

	@FindBy(how=How.ID,using="confirmPassword")
	private WebElement eleconfirmPwd;

	@FindBy(how=How.ID,using="_eventId_personal")
	private WebElement eleContinue;


	public EnterAccountDetailsPage selectCountry(String data) {
		selectDropDownUsingText(eleCountry, data);
		return this;
	}

	public EnterAccountDetailsPage enterMailID(String data) {
		type(eleEmail, data);
		return this;
	}

	public EnterAccountDetailsPage enterPassword(String data) {
		type(elepassword, data);
		return this;
	}

	public EnterAccountDetailsPage enterConfirmPassword(String data) {
		type(eleconfirmPwd, data);
		return this;
	}

	public UnknownPage clickContinue() {
		click(eleContinue);
		return new UnknownPage();
	}
}
