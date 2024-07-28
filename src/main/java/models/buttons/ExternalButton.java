package models.buttons;

import controllers.ElevatorController;

import java.security.interfaces.ECKey;

public class ExternalButton implements Buttons{
    private int floorNumber;
    private Direction buttonDisplay;
    private ElevatorController elevatorController;

    public ExternalButton(int floorNumber, Direction buttonDisplay) {
        this.floorNumber = floorNumber;
        this.buttonDisplay = buttonDisplay;
        this.elevatorController = ElevatorController.getInstance();
    }

    @Override
    public void onPressDown() {

    }
}
