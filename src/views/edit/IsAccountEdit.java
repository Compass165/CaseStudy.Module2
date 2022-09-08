package views.edit;

import controller.CRUD;
import model.Taoist;
import storage.FileWriteRead;

import java.util.List;

public class IsAccountEdit {

    static final String pathFile = "E:\\IntelliJ\\CaseStudy.Module2\\Database\\taoist.dat";
    List<Taoist> ListTaoist = FileWriteRead.getInstance().readFile(pathFile);
    public void checkAccountTaoist(int index, String account, String password, String name, boolean role) {
        if (new CheckNameAccout().checkNameAccount(account)) {
            System.err.println("[❌] Tài khoản đã tồn tại. Vui lòng sửa lại !!!");
            System.out.println("---------------------------------------");
        } else {
            new CRUD().edit(index,ListTaoist, new Taoist(account, password, name, role),pathFile);
            System.out.println("[\uD83D\uDC4C] Xóa thành công");
            System.out.println("----------------------------------------");
            System.out.println();
        } RunByAdmin.menuTaoistManager();
    }

}
