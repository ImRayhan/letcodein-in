package steps;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import actions.InputDatadriven_Actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InputDatadriven_Steps {
	WebDriver driver;
	CommonSteps commonSteps;
	InputDatadriven_Actions inputDatadrivenActions;

	public InputDatadriven_Steps(InputDatadriven_Actions inputDatadrivenActions, CommonSteps commonSteps) {
		this.driver = commonSteps.getDriver();
		this.inputDatadrivenActions = inputDatadrivenActions;

	}

	@When("I Click on input {string}")
	public void i_click_on_input(String link) {

		driver.findElement(By.partialLinkText(link)).click();

	}

	@Then("I enter {string} and {string} and {string} and {string}")
	public void i_enter_and_and_and(String string, String string2, String string3, String string4) {
		inputDatadrivenActions.enterYourFullName(string);
		inputDatadrivenActions.appendatextandpresskeyboardtab(string2);
		inputDatadrivenActions.whatisinsidethetextbox(string3);
		inputDatadrivenActions.clearthetext(string4);

	}

	@Then("I verfie value {string}")
	public void i_verfie_value(String string) {
		String a = inputDatadrivenActions.confirmtextisreadonly();
		if (!a.equals(string)) {
			fail();

		}

	}
	
	@When("I Click on input link")
	public void i_click_on_input_link() {
	   inputDatadrivenActions.clickOnInput();
	}

	@Then("I fillUp the form")
	public void i_fill_up_the_form(DataTable dataTable) {
		
	 inputDatadrivenActions.inputForm(dataTable.cell(1, 0), dataTable.cell(1, 1), dataTable.cell(1, 2), dataTable.cell(1, 3));
		
	}


}
