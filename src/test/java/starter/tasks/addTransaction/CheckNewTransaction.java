package starter.tasks.addTransaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.By;
import starter.questions.GetTransactionInfo;
import starter.ui.addTransaction.AddTransactionPage;
import starter.ui.addTransaction.CheckTransactionPage;

public class CheckNewTransaction implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(GetTransactionInfo.getDescription()).contains("prueba automatizada"),
                Ensure.that(CheckTransactionPage.TABLE_DATA).text().contains("500"));
    }
}
