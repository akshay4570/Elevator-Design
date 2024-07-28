package models.buttons;

import controllers.ElevatorController;
import models.algorithm.FCFS;

public class InternalButton implements Buttons{
    private int buttonNumber;
    private ElevatorController elevatorController;

    public InternalButton(int buttonNumber) {
        this.buttonNumber = buttonNumber;
        this.elevatorController = ElevatorController.getInstance();
        this.elevatorController.init(FCFS::new);
    }

    public int getButtonNumber() {
        return buttonNumber;
    }

    public void setButtonNumber(int buttonNumber) {
        this.buttonNumber = buttonNumber;
    }

    @Override
    public void onPressDown() {
        elevatorController.dispatchElevators(this.getButtonNumber());
    }

}
