package storage;

import controller.System.IOUploadFile;

import java.io.*;
import java.util.List;

public class FileWriteRead implements IOUploadFile {
    //Đã xài được Singleton
//    private List list;
//    private String pathFile;
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
