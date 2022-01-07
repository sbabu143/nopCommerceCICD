package org.example.step_def;

import cucumber.api.java.en.*;

import org.example.driver.DriverManager;
import org.example.pages.ContactUsPage;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class ContactUsSteps extends DriverManager {
    ContactUsPage contactUsPage = new ContactUsPage();

    @When("^I click on the \"([^\"]*)\" at footer menu$")
    public void i_click_on_the_at_footer_menu(String arg1) throws Throwable {
        contactUsPage.clickOnContactUs();

    }

    @Then("^I should see contact us page$")
    public void i_should_see_contact_us_page() throws Throwable {
        String getContactUsText = contactUsPage.getContactUsText();
        System.out.println(getContactUsText);
        assertThat(getContactUsText, is(equalToIgnoringCase("Contact Us")));

        String actualUrl = contactUsPage.getUrl();
        System.out.println(actualUrl);
        assertThat(actualUrl, is(endsWith("/contactus")));

    }
    @When("^I enter name \"([^\"]*)\", email \"([^\"]*)\" and enquiry \"([^\"]*)\"$")
    public void i_enter_name_email_and_enquiry(String Name, String Email, String Enquiry) throws Throwable {
        contactUsPage.enterNameEmailAndInquiry(Name,Email,Enquiry);
    }

    @When("^I click on submit on Contact Us page$")
    public void i_click_on_submit_on_Contact_Us_page() throws Throwable {
       contactUsPage.clickOnSubmitBtn();
    }

    @Then("^I should see \"([^\"]*)\" message$")
    public void i_should_see_message(String arg1) throws Throwable {
        String getSubmitBtnText= contactUsPage.getSubmitBtnText();
        System.out.println(getSubmitBtnText);
        assertThat(getSubmitBtnText, is(equalToIgnoringCase(
                "Your enquiry has been successfully sent to the store owner.")));
    }



}
