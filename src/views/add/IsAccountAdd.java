package views.add;

import model.Taoist;
import storage.FileWriteRead;

import java.util.List;

public class IsAccountAdd {

    static final String pathFile="E:\\IntelliJ\\CaseStudy.Module2\\Database\\taoist.dat";
    List<Taoist> listTaoist = FileWriteRead.getInstance().readFile(pathFile);
//    public void checkAccountTaoist(String account, String password, String name, boolean role) {
//        if (new CheckNameAcount().checkNameAccount(account)) {
//            System.err.println("[❌] Tài khoản đã tồn tại. Vui lòng thêm lại !!!");
//            System.out.println("---------------------------------------");
//        } else {
//            new CRUD().add(listTaoist,new Taoist(account,password,name,role),pathFile);
//            System.out.println("[\uD83D\uDC4C] Thêm thành công");
//            System.out.println("----------------------------------------");
//            System.out.println();
//        }
//        RunByMaster.menuTaoistManager();
//    }

}
