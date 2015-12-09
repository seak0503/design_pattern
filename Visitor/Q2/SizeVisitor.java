import java.util.Iterator;

public class SizeVisitor extends Visitor {
    private int currentsize = 0;
    public void visit(File file) {
    }
    public void visit(Directory directory) {
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            currentsize += entry.getSize();
        }
    }
    public int getCurrentsize() {
        return currentsize;
    }
}