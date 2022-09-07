package views.login;

import model.Taoist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Taoist> taoistList = new ArrayList<>();
        taoistList.add(new Taoist("01", "123456", "Phong Phũ Phàng", "Mao sơn Quỷ môn thuật", true));
        taoistList.add(new Taoist("02", "123456", "Lương Lém Lỉnh", "Mao sơn Quỷ môn thuật", false));
        taoistList.add(new Taoist("03", "123456", "Hùng Hóm Hỉnh", "Mao sơn Quỷ môn thuật", false));
        taoistList.add(new Taoist("04", "123456", "Huy Hấp Hối", "Mao sơn Quỷ môn thuật", false));

        Login login = new Login();
        login.choiceLogin();

    }

    public void choiceLogin() throws NumberFormatException {
        do {
            DisplayML.menuLogin();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    loginManager();
                    break;
                case 2:
                    new RegisterTaoist().registerAccountTaoist;
                    break;
                    case 0;
                    System.exit(0);
                    break;
                default:
                    System.out.println("[❌] Lựa chọn không tồn tại, mời các hạ nhập lại !!!");
                    break;
            }
    } while (true);
    }

    void loginManager() {
        try {
            System.out.println("┎──────────────[TRUY CẬP MÔN PHÁI]──────────────┒");
            System.out.print("┠ ▹ Nhập tài khoản Đạo sĩ: ");
            String account = scanner.nextLine();
            System.out.print("┠ ▹ Nhập mật khẩu: ");
            String password = scanner.nextLine();
            System.out.println("┖───────────────────────────────────────┚");
            CheckAccountForRole.checkAccount(account, password);
        } catch (Exception e) {
            e.getMessage();
        }
    }
    }

    void loginSystem() {
        try {
            choiceLogin();
        } catch (Exception e) {
            System.out.println("[❌] Các hạ đã nhập sai dữ liệu! Vui lòng nhập lại!");
            System.out.println("---------------------------------------------------");
            loginSystem();
        }
    }

}
