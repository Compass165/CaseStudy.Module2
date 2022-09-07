package views;

import model.Taoist;
import storage.FileWriteRead;

import java.util.List;
import java.util.Scanner;

public class Add {

    public void addLunisolarTools () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("┎──────────[THÊM ĐẠO CỤ KHU TÀ DIỆT QUỶ]──────────┒");
        System.out.println("[\uD83D\uDD11] Mời Tông chủ nhập thông tin:");
        System.out.println("--------------------------------------");
        System.out.print("┠ ▹ Nhập tài khoản Đạo sĩ: ");
        String account = scanner.nextLine();
        System.out.print("┠ ▹ Nhập passwword: ");
        String password = scanner.nextLine();
        System.out.print("┠ ▹ Nhập Pháp danh: ");
        String name = scanner.nextLine();
        System.out.print("┠ ▹ Nhập Chức danh (Tông chủ - Đạo sĩ): ");
        String role = scanner.nextLine();
        boolean roleReal = false;
        if (role.equals("Tông chủ")) {
            roleReal = true;
        }
        System.out.println("┖─────────────────────────────────────┚");
//        new checkAccountTaoist(account, password, name,roleReal);
    }

    static final String pathFile = "E:\\IntelliJ\\CaseStudy.Module2\\Database\\taoist.dat";

    List<Taoist> taoistList = FileWriteRead.getInstance().readFile(pathFile);

//    public void checkAccountTaoist(String account, String password, String name, boolean role) {
//        if(new Check)
//    }



}
