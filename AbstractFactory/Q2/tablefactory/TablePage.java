package tablefactory;
import factory.*;
import java.util.Iterator;

public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html>\n<head>\n");
        buffer.append("<meta charset=\"utf-8\">\n");
        buffer.append("<title>" + title + "</title>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<table width=\"80%\" border=\"3\">\n");
        Iterator it = content.iterator();
        while (it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append("<tr>\n" + item.makeHTML() + "</tr>\n");
        }
        buffer.append("</table>\n");
        buffer.append("<hr>\n");
        buffer.append("<address>" + author + "</address>\n");
        buffer.append("</body>\n</html>\n");
        return buffer.toString();
    }
}