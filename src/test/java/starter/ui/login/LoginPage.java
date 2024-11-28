package starter.ui.login;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static Target INPUTER_USERNAME = Target.the("input username").located(By.id("username"));
    public static Target INPUTER_PASSWORD = Target.the("input password").located(By.id("password"));
    public static Target BUTTON_LOGIN = Target.the("button inicio sesion").located(By.xpath("//button[contains(.,'Iniciar sesión')]"));


}
