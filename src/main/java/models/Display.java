package models;

public class Display {
    private int currentFloor;
    private Status status;
    private String description;

    public Display(int currentFloor, Status status) {
        this.currentFloor = currentFloor;
        this.status = status;
        this.description = "...Lifts Pvt Ltd.";
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Display{" +
                "currentFloor=" + currentFloor +
                ", status=" + status +
                ", description='" + description + '\'' +
                '}';
    }
}
