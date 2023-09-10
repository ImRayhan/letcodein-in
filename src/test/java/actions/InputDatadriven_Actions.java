package actions;

import org.openqa.selenium.WebDriver;

import elements.InputDatadriven_Elements;
import steps.CommonSteps;

public class InputDatadriven_Actions {

	WebDriver driver;

	InputDatadriven_Elements inputDatadrivenElements;
	CommonSteps commonSteps;

	public InputDatadriven_Actions(CommonSteps commonSteps) {
		this.driver = commonSteps.getDriver();

		inputDatadrivenElements = new InputDatadriven_Elements(driver);
	}

	public void enterYourFullName(String fullName) {
		inputDatadrivenElements.enteryourfullNameeElement.sendKeys(fullName);

	}

	public void appendatextandpresskeyboardtab(String apeend) {
		inputDatadrivenElements.appendatextandpreskeyboardtabeElement.clear();
		inputDatadrivenElements.appendatextandpreskeyboardtabeElement.sendKeys(apeend);

	}

	public void whatisinsidethetextbox(String what) {
		inputDatadrivenElements.whatisinsidethetextboxElement.clear();
		inputDatadrivenElements.whatisinsidethetextboxElement.sendKeys(what);

	}

	public void clearthetext(String clear) {

		inputDatadrivenElements.clearthetextElement.clear();
		inputDatadrivenElements.clearthetextElement.sendKeys(clear);

	}

	public String confirmtextisreadonly() {
		String text = inputDatadrivenElements.ConfirmtextisreadonlyElement.getAttribute("value");
		return text;

	}
	
	public void clickOnInput() {
		
		inputDatadrivenElements.inputEditElement.click();
		
	}
	public void inputForm(String fullName,String Append,String What,String Clear) {
		
		inputDatadrivenElements.enteryourfullNameeElement.sendKeys(fullName);
		inputDatadrivenElements.appendatextandpreskeyboardtabeElement.clear();
		inputDatadrivenElements.appendatextandpreskeyboardtabeElement.sendKeys(Append);
		inputDatadrivenElements.whatisinsidethetextboxElement.clear();
		inputDatadrivenElements.whatisinsidethetextboxElement.sendKeys(What);
		inputDatadrivenElements.clearthetextElement.clear();
		inputDatadrivenElements.clearthetextElement.sendKeys(Clear);
		
	}
	

}
