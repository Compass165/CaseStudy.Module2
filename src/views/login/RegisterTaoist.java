package views.login;

import java.util.Scanner;

public class RegisterTaoist {

    public void registerAccountUser() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("┎──────────────[Nhập môn]──────────────┒");
        System.out.println("[\uD83D\uDD11] Mời các hạ nhập thông tin:");
        System.out.println("--------------------------------------");
        System.out.print("┠ ▹ Nhập tài khoản Đạo sĩ đăng ký: ");
        String account = scanner.nextLine();
        System.out.print("┠ ▹ Nhập passwword: ");
        String password = scanner.nextLine();
        System.out.print("┠ ▹ Nhập Pháp danh: ");
        String name = scanner.nextLine();
        System.out.println("┖─────────────────────────────────────┚");
        new IsAccount().checkAccountTaoisnt(account, password, name,false);
    }

}
