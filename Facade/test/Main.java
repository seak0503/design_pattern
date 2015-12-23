import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("maildata.txt"));
            Object[] list = prop.keySet().toArray();
            String test = (String)list[0];
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}