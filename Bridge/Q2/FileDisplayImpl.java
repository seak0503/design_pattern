import java.io.*;

public class FileDisplayImpl extends DisplayImpl {
    private String filename;
    private BufferedReader reader;
    public FileDisplayImpl(String filename) {
        this.filename = filename;
    }
    public void rawOpen() {
        try {
            reader = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            System.out.println(filename + "が見つかりません。");
        }
    }
    public void rawPrint() {
        try {
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public void rawClose() {
        try {
            reader.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}