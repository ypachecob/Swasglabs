package com.co.swaglabs.stepsdefinitions;

import com.co.swaglabs.models.Credentials;
import com.co.swaglabs.questions.ValidarProducto;
import com.co.swaglabs.taks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginStepsDefinitions {
    @Managed
    WebDriver hisBrowser;


    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("yenifer");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));


    }
    @Given("^a user wants to enter the SWAGLABS website$")
    public void aUserWantsToEnterTheSWAGLABSWebsite() throws InterruptedException {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
        Thread.sleep(3000);
    }


    @When("^you enter the information requested on the page$")
    public void youEnterTheInformationRequestedOnThePage(List<Credentials>credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enter(credentials));

    }

    @When("^you don't enter information$")
    public void youDonTEnterInformation(List<Credentials>credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enter(credentials));

    }

    @Then("^authentically successfully$")
    public void authenticallySuccessfully() {
         OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarProducto.compare()
        , Matchers.is("bolso")));
    }

    @Then("^He could see error$")
    public void heCouldSeeError() {

    }

}
