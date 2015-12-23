import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("maildata.txt"));
            System.out.println(prop.propertyNames());
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}