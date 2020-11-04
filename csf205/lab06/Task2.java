import java.io.File;

import org.jdom2.Document;
import org.jdom2.input.SAXBuilder;
import org.jdom2.input.sax.XMLReaderJDOMFactory;
import org.jdom2.input.sax.XMLReaderXSDFactory;
import org.jdom2.input.sax.XMLReaders;

public class Task2 {
    public static void main(String args[]) throws Exception {
        SAXBuilder builder = new SAXBuilder(XMLReaders.XSDVALIDATING);

        try {
            Document document = builder.build("while.xml");
        } catch(Exception ex) {
            System.out.println("while.xml is not valid");
            System.out.println(ex.getMessage());
        }

        File xsdFile = new File("while.xsd");
        XMLReaderJDOMFactory factory = new XMLReaderXSDFactory(xsdFile);
        SAXBuilder builder2 = new SAXBuilder(factory);
        try {
            Document document2 = builder2.build("while2.xml");
        } catch(Exception ex) {
            System.out.println("while2.xml is not valid");
            System.out.println(ex.getMessage());
        }

    }
}