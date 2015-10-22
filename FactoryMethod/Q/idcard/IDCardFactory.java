package idcard;
import framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
    private Map<Integer, String> owners = new HashMap<Integer, String>();
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }
    protected void registerProduct(Product product) {
        owners.put(((IDCard)product).getSerial(), ((IDCard)product).getOwner());
    }
    public Map getOwners() {
        return owners;
    }
}