package views.login;

import model.Taoist;
import storage.FileWriteRead;

import java.util.List;

public class CheckGetRole {

    List<Taoist> taoistList = FileWriteRead.getInstance().readFile("E:\\IntelliJ\\CaseStudy.Module2\\Database\\taoist.dat");

    public int getCheckRole(String account, String password, int checkRole) {
        try {
            for (Taoist x : taoistList) {
                if (account.equals(x.getTaoistID()) && password.equals(x.getPassWord())) {
                    if (x.isRole()) checkRole = 1;
                    else checkRole = 2;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("[❌] Đăng nhập thất bại. Vui lòng đăng nhập lại !!!");
            System.out.println("-------------------------------------------------------");
            new Login().loginSystem();
        }
        return checkRole;

    }
}
