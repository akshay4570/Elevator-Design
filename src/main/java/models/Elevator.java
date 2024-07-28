package models;

import models.Display;
import models.Door;
import models.Status;
import models.buttons.Buttons;
import models.buttons.InternalButton;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Elevator {
    private int elevatorNum;
    private Display display;
    private int floorCount;
    private Door door;
    private int maximumLoad;
    private int maximumPerson;
    private List<InternalButton> listInternalButtons;

    public Elevator(int elevatorNum, Display display, int floorCount) {
        this.elevatorNum = elevatorNum;
        this.floorCount = floorCount;
        this.display = display;
        this.door = new Door();
        this.maximumLoad = 1000;
        this.maximumPerson = 12;
        listInternalButtons = new ArrayList<>();
        for(int i=0;i<=floorCount;i++){
            listInternalButtons.add(new InternalButton(i));
        }
    }

    public int getElevatorNum() { return elevatorNum; }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public int getMaximumLoad() {
        return maximumLoad;
    }

    public int getMaximumPerson() {
        return maximumPerson;
    }

    public List<InternalButton> getListInternalButtons() {
        return listInternalButtons;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public void pressKey(InternalButton button){
        InternalButton buttonPress = listInternalButtons.stream().
                filter(obj -> obj.getButtonNumber() == button.getButtonNumber())
                .toList().get(0);
        buttonPress.onPressDown();
    }

    public void signalAlarm(){
        System.out.println("Some issue with the Elevator Number " +getElevatorNum());
    }

    public void openDoor(){
        door.open();
    }

    public void closeDoor(){
        door.close();
    }

    public void move(int src, int dest){

    }

    @Override
    public String toString() {
        return "Elevator{" +
                "elevatorNum=" + elevatorNum +
                ", display=" + display +
                ", door=" + door +
                ", maximumLoad=" + maximumLoad +
                ", maximumPerson=" + maximumPerson +
                '}';
    }
}
