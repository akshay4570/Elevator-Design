package models.algorithm;

import java.util.PriorityQueue;
import java.util.Queue;

public class SSTF implements Algorithm{

    private Queue<Integer> priorityQueue;

    public SSTF() {
        this.priorityQueue = new PriorityQueue<>();
    }

    @Override
    public void applyAlgorithm() {

    }
}
