class Solution {
    public double averageWaitingTime(int[][] customers){
        int nextIdleTime = 0;
        long netWaitTime = 0;

        for (int i = 0; i < customers.length; i++) {

            nextIdleTime = Math.max(customers[i][0], nextIdleTime) + customers[i][1];//7+(7+4)+(11+3)+(20+1)
            
            netWaitTime += nextIdleTime - customers[i][0];//2+6+3
        }

        double averageWaitTime = (double) netWaitTime / customers.length;
        return averageWaitTime;
    }

}
