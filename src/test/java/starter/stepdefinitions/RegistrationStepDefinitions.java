package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import starter.tasks.registration.CheckNewAccountCreated;
import starter.tasks.registration.DontNotSendAllRequiredInformation;
import starter.tasks.registration.RegisterUser;
import starter.tasks.registration.ShouldSeeAllFieldsAreRequired;
import starter.ui.registration.RegisterPage;

import java.util.List;


public class RegistrationStepDefinitions {
    String name;
    String lastName;
    String age;
    String email;


    @Given("{actor} wants to sign up in the application")
    public void wantsToSighUpInTheApplication(Actor actor) {
        actor.attemptsTo(Open.browserOn(new RegisterPage()));


    }


    @When("{actor} send the required information to sign up")
    public void sendTheRequiredInformationToSignUp(Actor actor, DataTable userInfo) {
        List<List<String>> userList = userInfo.asLists(String.class);
        for (List<String> columns : userList) {
            name = columns.get(0);
            lastName = columns.get(1);
            age = columns.get(2);
            email = columns.get(3);
        }
        actor.attemptsTo(new RegisterUser(name, lastName, age, email)
        );
    }

    @Then("{actor} should have a new account created")
    public void shouldHaveANewAccountCreated(Actor actor) {
        actor.attemptsTo(
                new CheckNewAccountCreated(name, lastName)
        );

    }

    @When("{actor} does not send the required information")
    public void doesNotSendTheRequiredInformation(Actor actor) {
        actor.attemptsTo(new DontNotSendAllRequiredInformation(name, lastName));

    }

    @Then("{actor} should be told all fields are required")
    public void shouldBeToldAllFieldsAreRequireds(Actor actor) {
        actor.attemptsTo(new ShouldSeeAllFieldsAreRequired()
        );

    }
}
