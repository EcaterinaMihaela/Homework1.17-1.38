import com.google.gson.Gson;

public class A1 {
    private String nume;
    private int varsta;

    // Constructor
    public A1(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    // Metodă specifică clasei A1
    public void saluta() {
        System.out.println("Salut din A1! Numele meu este " + nume + " și am " + varsta + " ani.");
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

    // Convertim instanța în JSON
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
