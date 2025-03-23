public class Main {
    public static void main(String[] args) {
        // Creăm o instanță a clasei A1
        A1 a1 = new A1("Ion", 25);

        // Convertim A1 în JSON
        String json = a1.toJson();
        System.out.println("JSON-ul generat din A1: " + json);

        // Importăm JSON-ul într-o instanță a clasei A2
        A2 a2 = A2.fromJson(json);

        // Afișăm detaliile importate în A2
        a2.prezinta();
    }
}
