package starter.ui.registration;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterForm {

    public static Target INPUT_NAME = Target.the("input name").locatedBy("//input[@id='name']");
    public static Target INPUT_LAST_NAME = Target.the("input last name").locatedBy("//input[@id='last-name']");
    public static Target SELECT_COUNTRY = Target.the("select country").locatedBy("//select[@id='country']");
    public static Target INPUT_AGE = Target.the("input age").locatedBy("//input[@id='age']");
    public static Target INPUT_EMAIL = Target.the("input email").locatedBy("//input[@id='email']");
    public static Target INPUT_SEX = Target.the("input sex").locatedBy("//input[@id='sex-m']");
    public static Target INPUT_MONDAY = Target.the("input monday").locatedBy("//input[@id='monday']");
    public static Target INPUT_FILE = Target.the("input file").locatedBy("//input[@id='picture']");
    public static Target BTN_SAVE = Target.the("input file").locatedBy("//button[@id='save-btn']");

    public static Target ALERT_TEXT = Target.the("alert text").locatedBy("//div[@role='alert']");

}
