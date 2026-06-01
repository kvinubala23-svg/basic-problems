class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);

        int a = 0;
        int id = 0;

        for (int i = cost.length - 1; i >= 0; i--) {
            if (id % 3 != 2) {
                a += cost[i];
            }
            id++;
        }

        return a;
    }
}
