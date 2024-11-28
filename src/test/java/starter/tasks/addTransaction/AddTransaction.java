package starter.tasks.addTransaction;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.addTransaction.AddTransactionPage;

public class AddTransaction {

    public static Performable withInfo(String date, String amount, String description) {

        return Task.where("{0} enter the required information for the new transtaction",
                Click.on(AddTransactionPage.BUTTON_ADD),
                Enter.theValue(date).into(AddTransactionPage.INPUT_DATE),
                Enter.theValue(amount).into(AddTransactionPage.INPUT_AMOUNT),
                Enter.theValue(description).into(AddTransactionPage.INPUT_DESCRIPTION),
                Click.on(AddTransactionPage.BUTTON_GUARDAR)
        );
    }
}
