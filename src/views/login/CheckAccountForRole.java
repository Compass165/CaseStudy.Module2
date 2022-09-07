package views.login;

import java.util.InputMismatchException;

public class CheckAccountForRole {

    static void checkAccount(String account, String password) {
        int checkRole = 0;
        checkRole = new CheckGetRole().getCheckRole(account, password, checkRole);
        try {
            if (checkRole == 1) {
                System.out.println("[\uD83D\uDD13] Đăng nhập hệ thống bởi Tông chủ thành công !!!");
                System.out.println("------------------------------------------------------------");
                RunByAdmin.choiceUserOrStudent();
            } else if (checkRole == 2) {
                System.out.println("[\uD83D\uDD13] Đăng nhập hệ thống bởi Đạo sĩ thành công !!!");
                System.out.println("----------------------------------------------------------");
                RunByUser.menuUser();
            } else {
                System.out.println("Têm đăng nhập Đạp sĩ hoặc mật khẩu không đúng! Mời nhập lại: ");
                System.out.println("----------------------------------------------------------");
                System.out.println("----------------------------------------------------------");
                System.out.println("----------------------------------------------------------");
                new Login().loginManager();
            }
        } catch (InputMismatchException e) {
            e.getMessage();
        }
    }

}
