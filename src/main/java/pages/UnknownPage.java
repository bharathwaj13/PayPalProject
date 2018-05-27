package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class UnknownPage extends ProjectMethods {

	public UnknownPage() {
		PageFactory.initElements(driver, this);
	}

}
