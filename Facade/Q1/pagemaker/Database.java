package pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class Database {
    private Database() {
    }
    protected static Properties getProperties(String dbname) {
        String filename = dbname + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch (Exception e) {
            System.out.println("Warning: " + filename + " is not found.");
        }
        return prop;
    }
}