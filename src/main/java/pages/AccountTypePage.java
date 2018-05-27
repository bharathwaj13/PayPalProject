package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class AccountTypePage extends ProjectMethods {

	public AccountTypePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="radio-personal")
	private WebElement eleradio;

	@FindBy(how=How.LINK_TEXT,using="Next")
	private WebElement eleNextButton;

	public AccountTypePage verifyAndClickShoppers() {
		if(verifySelected(eleradio))
			click(eleradio);
		return this;
	}
	
	public EnterAccountDetailsPage clickNext() {
		click(eleNextButton);
		return new EnterAccountDetailsPage();
	}

}
