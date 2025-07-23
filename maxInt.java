import java.util.Stack;

class maxInt {
    public int maximumGain(String s, int x, int y) {

        if (x > y) {
            return removePattern(s, "ab", x, y);
        } else {
            return removePattern(s, "ba", y, x);
        }
    }

    private int removePattern(String s, String pattern, int high, int low) {
        Stack<Character> stack = new Stack<>();
        int score = 0;

        char first = pattern.charAt(0);
        char second = pattern.charAt(1);

        StringBuilder remaining = new StringBuilder();


        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == first && c == second) {
                stack.pop();
                score += high;
            } else {
                stack.push(c);
            }
        }


        while (!stack.isEmpty()) {
            remaining.insert(0, stack.pop());
        }


        for (char c : remaining.toString().toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == second && c == first) {
                stack.pop();
                score += low;
            } else {
                stack.push(c);
            }
        }

        return score;
    }
}

