public abstract class Builder {
    private int check_flag = 0;
    private String default_title = "初期タイトル";
    public void makeTitle(String title) {
        if (check_flag == 0) {
            buildTtitle(title);
            check_flag = 1;
        }
    }
    public void makeString(String str) {
        if (check_flag == 1) {
            buildString(str);
        } else {
            buildTtitle(default_title);
            check_flag = 1;
            buildString(str);
        }
    }
    public void makeItems(String[] items) {
        if (check_flag == 1) {
            buildItems(items);
        } else {
            buildTtitle(default_title);
            check_flag = 1;
            buildItems(items);
        }
    }
    public void close() {
        if (check_flag == 1) {
            buildDone();
        } else {
            buildTtitle(default_title);
            check_flag = 1;
            buildDone();
        }
    }
    public abstract void buildTtitle(String title);
    public abstract void buildString(String str);
    public abstract void buildItems(String[] items);
    public abstract void buildDone();
}