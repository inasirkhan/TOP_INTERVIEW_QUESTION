package top150.arraystrings;

public class GasStation {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int current =0;
        int total_gas = 0;
        int total_cost = 0;

        for(int i=0;i<gas.length;i++){
            total_gas+=gas[i];
        }

        for (int j=0;j<cost.length;j++){
            total_cost+=cost[j];
        }

        if (total_gas<total_cost){
            return -1;
        }

        for(int i=0;i<gas.length;i++){
            current+= gas[i]-cost[i];

            if(current<0){
                start = i+1;
                current = 0;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println("STARTING POINT TO COMPLETE THE CIRCUIT IS : "+canCompleteCircuit(gas, cost));
    }
}
