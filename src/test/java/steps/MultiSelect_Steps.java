package steps;

import org.openqa.selenium.WebDriver;

import actions.CommonActions;
import actions.MultiSelect_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultiSelect_Steps {

	WebDriver driver;
	MultiSelect_Actions multiSelectActions;
	CommonSteps commonSteps;
	CommonActions commonActions;

	public MultiSelect_Steps(CommonSteps commonSteps, MultiSelect_Actions multiSelectActions,CommonActions commonActions) {
		this.driver = commonSteps.getDriver();
		this.commonSteps = commonSteps;
		this.multiSelectActions = multiSelectActions;
		this.commonActions = commonActions;

	}

	@Given("I am on Homepage {string}")
	public void i_am_on_homepage(String string) {
		commonActions.getUrl(string);
		

	}

	@When("I click Multi Select")
	public void i_click_multi_select() {
		multiSelectActions.clickMultiSelect();

	}

	@Then("I Select all the menue presnt")
	public void i_select_all_the_menue_presnt() {
		System.out.println("das");

	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("das");

	}

}
