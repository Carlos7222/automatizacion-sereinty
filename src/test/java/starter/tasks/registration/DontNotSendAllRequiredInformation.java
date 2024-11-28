package starter.tasks.registration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.registration.RegisterForm;

public class DontNotSendAllRequiredInformation implements Task {

    private String name;
    private String lastName;

    public DontNotSendAllRequiredInformation(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(name).into(RegisterForm.INPUT_NAME),
                Enter.theValue(lastName).into(RegisterForm.INPUT_LAST_NAME),
                Click.on(RegisterForm.BTN_SAVE));
    }
}
