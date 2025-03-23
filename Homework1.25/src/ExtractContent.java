import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExtractTagContent {

    public static void main(String[] args) {
        String url = "https://www.ucv.ro";
        try {
            Document doc = Jsoup.connect(url).get();

            // Exemplu: Extragem toate elementele <span>
            List<String> spans = getTagContent(doc, "span");
            for (String span : spans) {
                System.out.println(span);
            }
        } catch (IOException e) {
            System.out.println("Eroare la încărcarea paginii: " + e.getMessage());
        }
    }

    // Metodă pentru a extrage conținutul unui tag HTML
    public static List<String> getTagContent(Document doc, String tag) {
        List<String> contentList = new ArrayList<>();

        // Căutăm toate instanțele tag-ului
        for (Element element : doc.select(tag)) {
            contentList.add(element.text()); // Adăugăm textul din interiorul tag-ului
        }

        return contentList;
    }
}
