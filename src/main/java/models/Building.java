package models;

import java.util.List;

public class Building {
    private String name;
    private List<Floor> listFloors;
    private List<Elevator> listElevators;

    public Building(String name, List<Floor> listFloors, List<Elevator> listElevators) {
        this.name = name;
        this.listFloors = listFloors;
        this.listElevators = listElevators;
    }

    public String getName() {
        return name;
    }

    public List<Floor> getListFloors() {
        return listFloors;
    }

    public List<Elevator> getListElevators() {
        return listElevators;
    }

    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", listFloors=" + listFloors +
                ", listElevators=" + listElevators +
                '}';
    }
}
