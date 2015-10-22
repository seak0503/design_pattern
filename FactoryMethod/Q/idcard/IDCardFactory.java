package idcard;
import framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
    private Map<Integer, String> database = new HashMap<Integer, String>();
    private int serial = 100;
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }
    protected void registerProduct(Product product) {
        IDCard card = (IDCard)product;
        database.put(card.getSerial(), card.getOwner());
    }
    public Map getDatabase() {
        return database;
    }
}