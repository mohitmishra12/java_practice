class OddSum {

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;


        for (int i = 1; i <= n; i++) {
            sumOdd += (2 * i - 1);
            sumEven += (2 * i);
        }

        return gcd(sumOdd, sumEven);
    }
}
