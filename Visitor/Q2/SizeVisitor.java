import java.util.Iterator;

public class SizeVisitor extends Visitor {
    private int currentsize = 0;
    public void visit(File file) {
        currentsize += file.getSize();
    }
    public void visit(Directory directory) {
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this)
        }
    }
    public int getCurrentsize() {
        return currentsize;
    }
}