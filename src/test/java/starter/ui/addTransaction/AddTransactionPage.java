package starter.ui.addTransaction;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddTransactionPage {
    public static Target BUTTON_ADD = Target.the("button add").located(By.xpath("//button[contains(.,'Añadir transacción')]"));
    public static Target INPUT_DATE = Target.the("input date").located(By.xpath("//input[@type='date']"));
    public static Target INPUT_AMOUNT= Target.the("input amount").located(By.id("amount"));
    public static Target INPUT_DESCRIPTION= Target.the("input descripcion").located(By.id("description"));
    public static Target BUTTON_GUARDAR= Target.the("input descripcion").located(By.xpath("//button[contains(.,'Guardar')]"));

}
