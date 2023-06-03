package org.fabricaescuela.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.fabricaescuela.tasks.ClickReEntryBtn;
import org.fabricaescuela.tasks.ReEntryInfo;
import org.fabricaescuela.tasks.SendApplication;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReEntryApplicationStepDefinitions {
    @Managed(driver = "chrome")
    public WebDriver driver;
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Stefany");
    }
    @Given("I am on the home page")
    public void userOnTheHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://ingresos-y-reingresos.vercel.app/"));
    }


    @When("I click on the \"Reingreso Estudiante\" button")
    public void userClickOnIngresoNuevoButton() {
        theActorInTheSpotlight().attemptsTo(ClickReEntryBtn.makeInformation());
    }

    @And("I enter the required information")
    public void userEntersReEntryInfo() {
        theActorInTheSpotlight().attemptsTo(ReEntryInfo.makeInformation());
    }

    @Then("I am able to send my application")
    public void userSeesAcademicTab() {
        theActorInTheSpotlight().attemptsTo(SendApplication.makeInformation());
    }

}
