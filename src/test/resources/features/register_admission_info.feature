#Authors: Stefany, Santiago and David

Feature: Registro de la informacion
  Como estudiante admitido en la U de A necesito ingresar mi
  informacion basica, academica y economica para que quede
  registrada en el sistema

  Scenario: Information registration
    Given I am on the admissions page
    When I click on the "Ingreso Nuevo" button
    And I enter my personal information
    Then I am able to see the registered information