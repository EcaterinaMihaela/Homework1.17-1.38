import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SaveStudentsToJson {
    public static void main(String[] args) {
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Ana", 20, 9.5));
        studenti.add(new Student("Maria", 22, 8.0));
        studenti.add(new Student("Ion", 21, 7.5));

        // Serializare în JSON
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter("students.json")) {
            gson.toJson(studenti, writer);
            System.out.println("Lista de studenți a fost salvată în fișierul students.json");
        } catch (IOException e) {
            System.out.println("Eroare la salvarea fișierului JSON: " + e.getMessage());
        }
    }
}
