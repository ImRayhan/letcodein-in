package actions;

import org.openqa.selenium.WebDriver;

import steps.CommonSteps;

public class CommonActions {
	WebDriver driver;
	CommonSteps commonSteps;

	public CommonActions(CommonSteps commonSteps) {
		this.driver = commonSteps.getDriver();
		this.commonSteps = commonSteps;

	}

	public void getUrl(String url) {
		driver.get(url);

	}

	public String getCurentUrl() {

		return driver.getCurrentUrl();

	}

	public String getCurrentTitle() {

		return driver.getTitle();

	}

}
