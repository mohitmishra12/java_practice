import java.util.HashMap;
import java.util.Map;

class spreateSheetDesign {
    private Map<String, Integer> d = new HashMap<>();

    public spreateSheetDesign(int rows) {
    }


    public void setCell(String cell, int value) {
        d.put(cell, value);
    }

    public void resetCell(String cell) {
        d.remove(cell);
    }

    public int getValue(String formula) {
        int ans = 0;
        for (String cell : formula.substring(1).split("\\+")) {
            ans += Character.isDigit(cell.charAt(0)) ? Integer.parseInt(cell)
                    : d.getOrDefault(cell, 0);
        }
        return ans;
    }
}
