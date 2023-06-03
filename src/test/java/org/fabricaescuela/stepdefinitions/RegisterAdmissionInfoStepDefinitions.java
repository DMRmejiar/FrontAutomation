package org.fabricaescuela.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.fabricaescuela.questions.RegisterBasicInfoValidation;
import org.fabricaescuela.tasks.ClickIngresoBtn;
import org.fabricaescuela.tasks.RegisterBasicInfo;
import org.fabricaescuela.tasks.SendBasicInfo;
import static org.hamcrest.core.IsEqual.equalTo;
import org.openqa.selenium.WebDriver;

public class RegisterAdmissionInfoStepDefinitions {
    @Managed(driver = "chrome")
    public WebDriver driver;
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Stefany");
    }
    @Given("I am on the admissions page")
    public void userOnTheAdmissionsPage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://ingresos-y-reingresos.vercel.app/"));
    }


    @When("^I click on the \"Ingreso Nuevo\" button")
    public void userClickOnIngresoNuevoButton() {
        theActorInTheSpotlight().attemptsTo(ClickIngresoBtn.makeInformation());
    }

    @And("I enter my personal information")
    public void userEntersPersonalInfo() {
        theActorInTheSpotlight().attemptsTo(RegisterBasicInfo.makeInformation());
    }

    @Then("I am able to see the registered information")
    public void userSeesRegisteredInfo() {
        theActorInTheSpotlight().should(seeThat(RegisterBasicInfoValidation.basicInfoValidation(),equalTo(true)));
        theActorInTheSpotlight().attemptsTo(SendBasicInfo.makeInformation());
    }
}
