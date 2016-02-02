import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("game.dat");
        String comment = "初期値";
        if (file.exists()) {
            comment = "ファイルがありました";
        } else {
            comment = "ファイルはありません";
        }
        System.out.println(comment);
    }
}

