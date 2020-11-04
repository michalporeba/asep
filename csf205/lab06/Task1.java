import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;
import org.jdom2.filter.ElementFilter;
import org.jdom2.input.SAXBuilder;

public class Task1 {
    public static void main(String args[]) throws Exception {
        SAXBuilder builder = new SAXBuilder();

        Document recipes = builder.build("recipes.xml");
        Namespace ns = Namespace.getNamespace("rcp");

        for (Element e : recipes.getDescendants(new ElementFilter("recipe"))) {
            String id = e.getAttributeValue("id");
            String title = e.getChildText("title", e.getNamespace());

            System.out.println("Recipe ID=" + id + ", Title=" + title);
        }
    }
}