package game;
import java.util.*;

public class Memento {
    private int number;
    int money;
    ArrayList<String> fruits;
    public int getMoney() {
        return money;
    }
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
        this.number = 0;
    }
    void addFruit(String fruit) {
        fruits.add(fruit);
        number += 1;
    }
    List<String> getFruits() {
        return (List)fruits.clone();
    }
    int getNumber() {
        return number;
    }
}