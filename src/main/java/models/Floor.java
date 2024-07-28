package models;

import models.buttons.Buttons;
import models.buttons.ExternalButton;

import java.util.List;

public class Floor {
    private int floorNum;
    private List<Buttons> listExternalButtons;

    public Floor(int floorNum, List<Buttons> listExternalButtons) {
        this.floorNum = floorNum;
        this.listExternalButtons = listExternalButtons;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public List<Buttons> getListExternalButtons() {
        return listExternalButtons;
    }
}
