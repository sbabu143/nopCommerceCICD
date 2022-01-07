package org.example.step_def;

import cucumber.api.java.en.*;
import org.example.driver.DriverManager;
import org.example.pages.ComputerPage;

public class ComputerSteps extends DriverManager {
    ComputerPage computerPage=new ComputerPage();

    @When("^I click on Lenovo IdeaCentre (\\d+) All-in-One PC$")
    public void i_click_on_Lenovo_IdeaCentre_All_in_One_PC(int arg1) throws Throwable {

    }

    @Then("^I click on \"([^\"]*)\"$")
    public void i_click_on(String arg1) throws Throwable {

    }
}
