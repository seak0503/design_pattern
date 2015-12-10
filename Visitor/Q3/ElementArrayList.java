import java.util.ArrayList;
import java.util.Iterator;

public class ElementArrayList extends ArrayList implements Element {
    public void accept(Visitor v) {
        Iterator it = this.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(v);
        }
    }

}