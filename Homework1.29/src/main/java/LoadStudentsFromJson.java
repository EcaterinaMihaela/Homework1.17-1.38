import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class LoadStudentsFromJson {
    public static void main(String[] args) {
        // Citirea fișierului JSON
        Gson gson = new Gson();
        try (FileReader reader = new FileReader("students.json")) {
            Type studentListType = new TypeToken<List<Student>>(){}.getType();
            List<Student> studenti = gson.fromJson(reader, studentListType);
            System.out.println("Lista de studenți încărcată:");
            for (Student student : studenti) {
                System.out.println(student);
            }
        } catch (IOException e) {
            System.out.println("Eroare la citirea fișierului JSON: " + e.getMessage());
        }
    }
}
