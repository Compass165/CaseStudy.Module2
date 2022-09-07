package views.login;

import model.Taoist;
import storage.FileWriteRead;

import java.util.List;

public class CheckNameAccount {

    List<Taoist> taoistList = FileWriteRead.getInstance().readFile("src/w_database/users.dat");;
    public boolean checkNameAccount(String accountUser) {
        for (Taoist account : taoistList) {
            boolean checkAccountTaoist = accountTaoisnt.equals(account.TaoistID());
            if (checkAccountTaoist) {
                return true;
            }
        }
        return false;
    }

}
