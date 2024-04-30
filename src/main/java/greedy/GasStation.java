package main.java.greedy;

public class GasStation {

    public int canCompleteCircuit(int[] gas,int[] cost){

        int startStation =0;
        int currCost = 0;
        int totalCost = 0;

        for (int i = 0; i < gas.length; i++) {
            currCost += (gas[i] - cost[i]);
            totalCost += (gas[i] - cost[i]);
            if (currCost < 0) {
                startStation = i+1;
                currCost=0;
            }
        }
        if (totalCost < 0) {
            return -1;
        }
        return startStation;
    }

}
