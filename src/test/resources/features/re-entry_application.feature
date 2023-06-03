#Authors: Stefany, Santiago and David

Feature: Solicitud de reingreso
  Como antiguo estudiante de la U de A necesito realizar
  una solicitud de reingreso

  Scenario: Re-entry application
    Given I am on the home page
    When I click on the "Reingreso Estudiante" button
    And I enter the required information
    Then I am able to send my application