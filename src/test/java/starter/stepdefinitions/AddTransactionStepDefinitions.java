package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.actions.Open;

import starter.models.LoginModel;
import starter.models.TransactionModel;
import starter.tasks.addTransaction.AddTransaction;
import starter.tasks.addTransaction.CheckNewTransaction;
import starter.tasks.login.Login;
import starter.tasks.navigation.NavigateTo;
import starter.util.GetInfoFromTable;

import java.util.List;

public class AddTransactionStepDefinitions {
    @Given("{actor} is logged into the application")
    public void isLoggedIntoTheApplication(Actor actor, DataTable table) {
        LoginModel loginModel = GetInfoFromTable.getLoginFromData(table);
        actor.attemptsTo(NavigateTo.loginPage(),
                new Login(loginModel.getUsername(), loginModel.getPassword())
        );

    }

    @When("{actor} enter the required information fo the new transtaction")
    public void enterTheRequiredInformationForTheNewTransaction(Actor actor, DataTable table) {
        TransactionModel transaction = GetInfoFromTable.getTransactionData(table);
        actor.attemptsTo(
                AddTransaction.withInfo(transaction.getDate(), transaction.getAmount(), transaction.getDescription())
        );
    }

    @Then("{actor} should see a new transaction in the table")
    public void shouldSeeANewtransactionInTheTable(Actor actor) {
        new CheckNewTransaction();
    }
}
