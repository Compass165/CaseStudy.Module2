package controller;

import storage.FileWriteRead;

import java.util.List;

public class CRUD implements controller.System.CRUD {
    FileWriteRead fileWriteRead = FileWriteRead.getInstance();
    @Override
    public void add(List arr, Object element, String pathFile) {
        arr.add(element);
        fileWriteRead.writeFile(arr,pathFile);
    }

    @Override
    public void edit(int index, List arr, Object element, String pathFile) {
        arr.set(index,element);
        fileWriteRead.writeFile(arr,pathFile);
    }

    @Override
    public void remove(int index, List arr, String pathFile) {
        arr.remove(index);
        fileWriteRead.writeFile(arr,pathFile);
    }
}
