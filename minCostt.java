class minCostt {
    public int minCost(String colors, int[] neededTime) {
        int ans = 0;
        int maxNeededTime = neededTime[0];

        for (int i = 1; i < colors.length(); ++i)
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                ans += Math.min(maxNeededTime, neededTime[i]);

                maxNeededTime = Math.max(maxNeededTime, neededTime[i]);
            } else {

                maxNeededTime = neededTime[i];
            }

        return ans;
    }
}
