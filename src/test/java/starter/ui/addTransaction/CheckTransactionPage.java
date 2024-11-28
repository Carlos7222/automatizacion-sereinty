package starter.ui.addTransaction;

import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckTransactionPage {
    public static Target TABLE_DATA = Target.the("data table").located(By.id("transaction-list"));
    public static By TRANSACTIONS_TABLE_XPATH = By.id("transaction-list");
}
