package idcard;
import framework.*;

public class IDCard extends Product {
    private static int cache = 0;
    private int serial;
    private String owner;
    IDCard(String owner) {
        System.out.println(owner + "のカードを作ります。");
        this.serial = cache;
        this.owner = owner;
        cache++;
    }
    public void use() {
        System.out.println(owner + "のカードを使います。");
    }
    public String getOwner() {
        return owner;
    }
    public int getSerial() {
        return serial;
    }
}