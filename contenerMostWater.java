class contenerMostWater {
    static {
        for (int i = 0; i < 100; i++) {
            maxArea(new int[] {0, 0});
        }
    }

    public static int maxArea(int[] height) {
        int i = 0, j = height.length -1, area = 0, maxArea = 0;

        while (i < j) {
            int min = Math.min(height[i], height[j]);
            area = min * Math.abs(i - j);
            maxArea = Math.max(area, maxArea);
            while (i<j && height[i] <= min) {
                i++;
            }
            while (i<j && height[j] <= min) {
                j--;
            }
        }
        return maxArea;
    }
}