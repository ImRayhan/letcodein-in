package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputDatadriven_Elements {
	WebDriver driver;

	public InputDatadriven_Elements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Edit']")
	public WebElement inputEditElement;

	@FindBy(xpath = "//input[@id='fullName']")
	public WebElement enteryourfullNameeElement;

	@FindBy(xpath = "//input[@id='join']")
	public WebElement appendatextandpreskeyboardtabeElement;

	@FindBy(xpath = "//input[@id='getMe']")
	public WebElement whatisinsidethetextboxElement;

	@FindBy(xpath = "//input[@id='clearMe']")
	public WebElement clearthetextElement;

	@FindBy(xpath = "//input[@id='dontwrite']")
	public WebElement ConfirmtextisreadonlyElement;

	@FindBy(xpath = "//input[@id='noEdit']")
	public WebElement confirmeditfieldisdisabledElement;

}
