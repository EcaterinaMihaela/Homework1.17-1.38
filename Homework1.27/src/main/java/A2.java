import com.google.gson.Gson;

public class A2 {
    private String nume;
    private int varsta;

    // Constructor
    public A2(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    // Metodă specifică clasei A2
    public void prezinta() {
        System.out.println("Salut din A2! Numele meu este " + nume + " și am " + varsta + " ani.");
    }

    // Getter și Setter pentru atribute
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    // Importăm datele din JSON
    public static A2 fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, A2.class);
    }
}
