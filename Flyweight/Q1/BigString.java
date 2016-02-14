public class BigString {
    private BigChar[] bigchars;
    public BigString(String string) {
        bigchars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i));
        }
    }
    public BigString(String string, boolean shared) {
        if (shared) {
            bigchars = new BigChar[string.length()];
            for (int i = 0; i < bigchars.length; i++) {
                bigchars[i] = new BigChar(string.charAt(i));
            }
        } else {
            new BigString(string);
        }
    }
    public void print() {
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i].print();
        }
    }
}