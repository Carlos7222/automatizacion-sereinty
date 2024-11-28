package starter.tasks.registration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.targets.Target;
import starter.ui.registration.RegisterForm;
import starter.ui.registration.RegisterForm.*;

import java.net.URISyntaxException;


public class RegisterUser implements Task {

    public RegisterUser(String name, String lastName, String age, String email) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;

    }

    private String name;
    private String lastName;
    private String age;
    private String email;

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(Enter.theValue(name).into(RegisterForm.INPUT_NAME),
                    Enter.theValue(lastName).into(RegisterForm.INPUT_LAST_NAME),
                    Enter.theValue(age).into(RegisterForm.INPUT_AGE),
                    SelectFromOptions.byVisibleText("Colombia").from(RegisterForm.SELECT_COUNTRY),
                    Click.on(RegisterForm.INPUT_SEX),
                    Enter.theValue(email).into(RegisterForm.INPUT_EMAIL),
                    Click.on(RegisterForm.INPUT_MONDAY),
                    Upload.theClasspathResource("pictures/1643808048701.jpeg").to(RegisterForm.INPUT_FILE),
                    Click.on(RegisterForm.BTN_SAVE));
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }
}
