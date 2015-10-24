public class Triple {
    private static Triple[] triple = new Triple[3];
    private static int id;
    private Triple() {
        for (int i = 0; 3 > i; i++) {
            triple[i] = new Triple();
        }
    }
    public static Triple getInstance(int id) {
        return triple[id];
    }
}