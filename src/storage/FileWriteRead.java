package storage;

import controller.System.IOUploadFile;
import model.LunisolarArmor;
import model.LunisolarEdema;
import model.LunisolarSword;
import model.LunisolarTools;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileWriteRead implements IOUploadFile {
    //Đã xài được Singleton
//    private List list;
//    private String pathFile;
    public static void main(String[] args) {
//        List<Taoist> taoistList = new ArrayList<>();
//
//        taoistList.add(new Taoist("01", "123456", "Phong Phũ Phàng", true));
//        taoistList.add(new Taoist("02", "123456", "Lương Lém Lỉnh", false));
////        taoistList.add(new Taoist("03", "123456", "Bảnh Bụng Bự", false));
////        taoistList.add(new Taoist("04", "123456", "Huy Hững Hờ", false));
////        taoistList.add(new Taoist("05", "123456", "Hân Hóm Hỉnh", false));
////        taoistList.add(new Taoist("06", "123456", "Hằng Hợm Hĩnh", false));
////        taoistList.add(new Taoist("07", "123456", "Trung Trống Trịu", false));
////        taoistList.add(new Taoist("08", "123456", "Linh Lỳ Lợm", false));
////        taoistList.add(new Taoist("09", "123456", "Hoàng Hung Hăng", false));
////        taoistList.add(new Taoist("10", "123456", "Cuân Cáu Cỉnh", false));
//        FileWriteRead.getInstance().writeFile(taoistList, "E:\\IntelliJ\\CaseStudy.Module2\\database\\taoist.dat");
//        System.out.println(FileWriteRead.getInstance().readFile("E:\\IntelliJ\\CaseStudy.Module2\\database\\taoist.dat"));

        List<LunisolarTools> lunisolarToolsList = new ArrayList<>();
        lunisolarToolsList.add(new LunisolarSword("S01", "Âm dương Kiếm", "Kiếm", 500, 5000, "Kiếm xịn", 50000, 400));
        lunisolarToolsList.add(new LunisolarEdema("E02", "Tâm linh Phù triền", "Phù triền", 400, 4000, "Kim phù",5000,4000));
        lunisolarToolsList.add(new LunisolarArmor("A03","Linh hồn Giáp", "Giáp", 600, 6000, "Huyễn Giáp", 6000, 6000));
        FileWriteRead.getInstance().writeFile(lunisolarToolsList, "E:\\IntelliJ\\CaseStudy.Module2\\database\\lunisolarTools.dat");
        System.out.println(FileWriteRead.getInstance().readFile("E:\\IntelliJ\\CaseStudy.Module2\\database\\lunisolarTools.dat"));

    }
    private static FileWriteRead instance=null;

    private FileWriteRead() {
    }

//    private FileWriteRead(List list, String pathFile) {
//        this.list = list;
//        this.pathFile = pathFile;
//    }

//    public static FileWriteRead getInstance(List list, String pathFile){
    public static FileWriteRead getInstance(){
//        if (instance == null) instance = new FileWriteRead(list, pathFile);
        if (instance == null) instance = new FileWriteRead();
        return instance;
    }
    @Override
    public void writeFile(List list, String pathFile) {
        try {
            FileOutputStream fos = new FileOutputStream(pathFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List readFile(String pathFile) {
        try {
            FileInputStream fis = new FileInputStream(pathFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object ob = ois.readObject();
            List list = (List) ob;
            ois.close();
            fis.close();
            return list;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
