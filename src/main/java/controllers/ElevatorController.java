package controllers;

import models.algorithm.Algorithm;

//Singleton Class
public class ElevatorController {
    private Algorithm algorithm;
    private static ElevatorController elevatorController = null;

    private ElevatorController(){}

    public static ElevatorController getInstance(){
        if(elevatorController == null){
            elevatorController = new ElevatorController();
        }
        return elevatorController;
    }

    public void init(Algorithm algorithm){
        this.algorithm = algorithm;
    }
    public Algorithm getAlgorithm() {
        return algorithm;
    }

    public void dispatchElevators(int requestedSrc){

    }

}
