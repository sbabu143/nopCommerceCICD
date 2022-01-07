@contactus
Feature: Check contact us form functionality

  Scenario: Validate Contact Us page
    Given I am on the home page
    When I click on the "contact us" at footer menu
    Then I should see contact us page
    And the url should contain with "/contactus"

  Scenario: Validate ContactUs inquiry form
    Given I am on the home page
    When I click on the "contact us" at footer menu
    Then I should see contact us page
    When I enter name "Tanay", email "TanB@gmail.com" and enquiry "About delivery"
    And I click on submit on Contact Us page
    Then I should see "Your enquiry has been successfully sent to the store owner" message