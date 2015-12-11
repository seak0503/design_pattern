import java.util.ArrayList;

public abstract class Support {
    private String name;
    private Support next;
    private ArrayList<Support> slist = new ArrayList<>();
    public Support(String name) {
        this.name = name;
    }
    public Support setNext(Support next) {
        slist.add(next);
        return this;
    }
    public void support(Trouble trouble) {
        for (int i = 0; i < slist.size(); i++) {
            if (slist.get(i).resolve(trouble)) {
                slist.get(i).done(trouble);
                break;
            } else if (i + 1 == slist.size()) {
                fail(trouble);
            }
        }
    }
    public String toString() {
        return "[" + name + "]";
    }
    protected abstract boolean resolve(Trouble trouble);
    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }
    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}