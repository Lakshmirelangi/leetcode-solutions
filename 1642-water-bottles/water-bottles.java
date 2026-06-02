class Solution {

    public int numWaterBottles(int numBottles, int numExchange) {

       /* int totalDrank = 0;

        int emptyBottles = 0;

        // Continue while full bottles exist
        while(numBottles > 0) {//TIME COMPLEXITY:O(log n)

            // Drink current full bottles
            totalDrank += numBottles;

            // Add to empty bottles
            emptyBottles += numBottles;

            // Exchange empty bottles
            numBottles = emptyBottles / numExchange;

            // Remaining empty bottles
            emptyBottles = emptyBottles % numExchange;
        }

        return totalDrank;
    }
}*/


//OPTMIZED APPROACH:O(1)
return numBottles + (numBottles-1)/(numExchange-1);
    }
}