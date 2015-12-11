import java.util.ArrayList;



class Test {
    public ArrayList<String> slist = new ArrayList<>();
    public String setNext(String next) {
        slist.add(next);
        return slist.get(slist.size() - 1)

    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("aaa");
        strings.add("bbb");
        System.out.println(strings.get(strings.size() - 1));
    }
}