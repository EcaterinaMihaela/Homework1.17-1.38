import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import java.io.FileWriter;
import java.io.IOException;

public class APIClient {
    public static void main(String[] args) {
        // URL-ul API-ului public
        //JSONPlaceholder, care furnizează date de test pentru aplicațiile de dezvoltare
        String url = "https://jsonplaceholder.typicode.com/posts";

        // Preluăm datele de la API
        String jsonResponse = fetchDataFromAPI(url);

        if (jsonResponse != null) {
            // Prelucrăm datele și le salvăm într-un fișier JSON
            saveJsonToFile(jsonResponse, "posts.json");
        }
    }

    // Metodă pentru a prelua date de la API
    public static String fetchDataFromAPI(String url) {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(url);
            HttpResponse response = client.execute(request);
            String result = EntityUtils.toString(response.getEntity());
            return result;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Metodă pentru a salva datele JSON într-un fișier
    public static void saveJsonToFile(String json, String filename) {
        try (FileWriter file = new FileWriter(filename)) {
            Gson gson = new Gson();
            // Împachetăm răspunsul JSON într-un JsonArray pentru a-l salva ușor în fișier
            JsonArray jsonArray = gson.fromJson(json, JsonArray.class);
            gson.toJson(jsonArray, file);
            System.out.println("Datele au fost salvate în fișierul " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
