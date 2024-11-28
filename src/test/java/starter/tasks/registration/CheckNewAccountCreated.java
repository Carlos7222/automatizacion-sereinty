package starter.tasks.registration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import starter.ui.registration.SummaryPage;

public class CheckNewAccountCreated implements Task {

    private String name;
    private String lastName;

    public CheckNewAccountCreated(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Switch.toWindowTitled("Summary"),
                Ensure.that(SummaryPage.LABEL_NAME).text().containsIgnoringCase(name),
                Ensure.that(SummaryPage.LABEL_LAST_NAME).text().containsIgnoringCase(lastName));
    }
}
