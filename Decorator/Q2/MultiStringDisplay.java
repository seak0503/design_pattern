import java.util.*;

public class MultiStringDisplay extends Display {
    private ArrayList<String> strings = new ArrayList<>();
    private int maxlength = 0;
    public void add(String string) {
        strings.add(string);
        updateColumn(string);
    }
    public int getColumns() {
        return maxlength;
    }
    public int getRows() {
        return strings.size();
    }
    public String getRowText(int row) {
        return strings.get(row);
    }
    private void updateColumn(String string) {
        if (string.getBytes().length > maxlength) {
            maxlength = string.getBytes().length;
        }
        for (int row = 0; row < strings.size(); row++) {
            int fills = maxlength - (strings.get(row)).getBytes().length;
            if (fills > 0) {
                strings.set(row, strings.get(row) + spaces(fills));
            }
        }
    }
    private String spaces(int count) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(' ');
        }
        return buf.toString();
    }
}