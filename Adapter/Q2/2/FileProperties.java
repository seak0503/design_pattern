import java.io.*;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {
    public void readFromFile(String filename) throws IOException {
        load(new FileInputStream(filename));
    }
    public void writeToFile(String filename) throws IOException {
        String comment = "#written by FileProperties";
        store(new FileOutputStream(filename), comment);
    }
    public void setValue(String key, String value) {
        setProperty(key, value);
    }
    public String getValue(String key) {
        return getProperty(key);
    }
}