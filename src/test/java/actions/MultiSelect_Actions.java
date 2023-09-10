package actions;

import org.openqa.selenium.WebDriver;

import elements.MultiSelect_Elements;
import steps.CommonSteps;

public class MultiSelect_Actions {

	WebDriver driver;
	MultiSelect_Elements multiSelectElements;
	CommonSteps commonSteps;
	CommonActions commonActions;
	MultiSelect_Elements multiSelect_Elements;

	public MultiSelect_Actions(CommonSteps commonSteps, CommonActions commonActions) {
		this.driver = commonSteps.getDriver();
		this.commonSteps = commonSteps;
		this.commonActions = commonActions;
		multiSelect_Elements = new MultiSelect_Elements(driver);

	}

	public void openUrl(String url) {
		commonActions.getUrl(url);

	}

	public void clickMultiSelect() {
		multiSelect_Elements.multiselectElement.click();

	}
	
	

}
