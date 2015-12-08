import java.util.Iterator;
import java.util.ArrayList;

public class FileFindVisitor extends Visitor {
    private ArrayList<File> files;
    private String ext;
    public FileFindVisitor(String ext) {
        this.ext = ext;
        this.files = new ArrayList<>();
    }
    public void visit(File file) {
        if (file.getName().indexOf(ext) != -1) {
            files.add(file);
        }
    }
    public void visit(Directory directory) {
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
    }
    public Iterator getFoundFiles() {
        return files.iterator();
    }
}