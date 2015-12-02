import java.util.*;

public class MultiStringDisplay extends Display {
    private ArrayList<String> strings;
    private int maxlength;
    public MultiStringDisplay() {
        this.strings = new ArrayList<>();
        this.maxlength = 0;
    }
    public void add(String string) {
        strings.add(string);
        checkLength(string.length());
    }
    public int getColumns() {
        return maxlength * 2;
    }
    public int getRows() {
        return strings.size();
    }
    public String getRowText(int row) {
        return getString(strings.get(row));
    }
    private void checkLength(int length) {
        if (maxlength < length) {
            maxlength = length;
        }
    }
    private String getString(String string) {
        int l = string.length();
        if (maxlength > l) {
            StringBuffer buf = new StringBuffer();
            for (int i = 0; i < (maxlength - l); i++) {
                buf.append("  ");
            }
            string = string + buf;
        }
        return string;
    }
}