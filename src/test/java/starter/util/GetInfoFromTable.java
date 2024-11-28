package starter.util;

import io.cucumber.datatable.DataTable;
import starter.models.LoginModel;
import starter.models.TransactionModel;

import java.util.List;

public class GetInfoFromTable {


    public static LoginModel getLoginFromData(DataTable table) {
        List<List<String>> filas = table.asLists(String.class);
        LoginModel model = new LoginModel();

        for (List<String> columns : filas) {
            model.setUsername(columns.get(0));
            model.setPassword(columns.get(1));
        }

        return model;
    }

    public static TransactionModel getTransactionData(DataTable table) {
        List<List<String>> filas = table.asLists(String.class);
        TransactionModel transactionModel = new TransactionModel();
        for (List<String> columns : filas) {
            transactionModel.setDate(columns.get(0));
            transactionModel.setAmount(columns.get(1));
            transactionModel.setDescription(columns.get(2));

        }
        return transactionModel;
    }
}
