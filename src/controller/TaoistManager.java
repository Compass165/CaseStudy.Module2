package controller;

import model.LunisolarTools;

import java.util.List;

public class TaoistManager  {

    public int checkIndex(List arr, String toolsID) {
        List<LunisolarTools> lunisolarTools = (List<LunisolarTools>) arr;
        int index = 0;
        for (int i = 0; i < arr.size(); i++) {
            if(toolsID.equals(lunisolarTools.get(i).getToolsID())) {
                index = i;
            }
        } return index;
    }

}
