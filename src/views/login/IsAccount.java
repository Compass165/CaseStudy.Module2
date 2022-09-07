package views.login;

import model.CRUD;
import model.Taoist;
import storage.FileWriteRead;

import java.util.List;

public class IsAccount {

    static final String pathFile="src/w_database/users.dat";
    List<Taoist> taoistList = FileWriteRead.getInstance().readFile("E:\\IntelliJ\\CaseStudy.Module2\\Database\\taoist.dat");;
    public void checkAccountUser(String account, String password, String name, boolean role) {
        if (new CheckNameAcount().checkNameAccount(account)) {
            System.out.println("[❌] Tài khoản đã tồn tại. Vui lòng đăng ký lại !!!");
            System.out.println("---------------------------------------");
        } else {
            new CRUD().add(taoistList, new Taoist(taoist));
            System.out.println("[\uD83D\uDC4C] Đăng ký thành công. Mời đăng nhập vào hệ thống !!!");
            System.out.println("----------------------------------------");
            System.out.println();
        }
        new Login().loginSystem();
    }

}
