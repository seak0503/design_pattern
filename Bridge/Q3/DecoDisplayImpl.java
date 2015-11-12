public class DecoDisplayImpl extends DisplayImpl {
    private char sdeco;
    private char mdeco;
    private char edeco;
    public DecoDisplayImpl(char sdeco, char mdeco, char edeco) {
        this.sdeco = sdeco;
        this.mdeco = mdeco;
        this.edeco = edeco;
    }
    public void rawOpen() {
        System.out.print(sdeco);
    }
    public void rawPrint() {
        System.out.print(mdeco);
    }
    public void rawClose() {
        System.out.println(edeco);
    }
}