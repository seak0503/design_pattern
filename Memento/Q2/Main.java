import game.Memento;
import game.Gamer;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("game.dat");
        if (file.exists()) {
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
                    Memento memento = (Memento) ois.readObject();
                    Gamer gamer = new Gamer(memento.getMoney());
                    System.out.println("ファイルあり");
                    game(gamer, memento, file);
            } catch (IOException | ClassNotFoundException e) {
            }
        } else {
            Gamer gamer = new Gamer(100);
            Memento memento = gamer.createMemento();
            System.out.println("ファイルなし");
            game(gamer, memento, file);
        }
    }
    public static void game(Gamer gamer, Memento memento, File file) {
        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);
            System.out.println("現状:" + gamer);
            gamer.bet();

            System.out.println("所持金は" + gamer.getMoney() + "円になりました。");

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("    (だいぶ増えたので、現在の状態を保存しておこう)");
                memento = gamer.createMemento();
                try {
                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
                    oos.writeObject(memento);
                } catch (IOException e) {
                }
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("    (だいぶ減ったので、以前の状態に復帰しよう)");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("");
        }
    }

}