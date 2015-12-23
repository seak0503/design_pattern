package pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }
    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph(username + "のページへようこそ。");
            writer.paragraph("メールまっていますね。");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void makeLinkPage(String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            Object[] addrs = mailprop.keySet().toArray();
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Link page");
            for (int i = 0; i < addrs.length; i++) {
                String mailaddr = (String)addrs[i];
                String username = mailprop.getProperty(mailaddr);
                writer.mailto(mailaddr, username);
            }
            writer.close();
            System.out.println(filename + " is created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}