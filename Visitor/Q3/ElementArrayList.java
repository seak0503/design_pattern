import java.util.ArrayList;
import java.util.Iterator;

public class ElementArrayList extends ArrayList implements Element {
    public void accept(Visitor v) {
        Iterator it = this.iterator();
        while (it.hasNext()) {
            Element entry = (Element)it.next();
            entry.accept(v);
        }
    }

}