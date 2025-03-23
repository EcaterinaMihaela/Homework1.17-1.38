import com.google.gson.annotations.SerializedName;

public class Student {
    @SerializedName("nume")
    private String nume;

    @SerializedName("varsta")
    private int varsta;

    @SerializedName("nota")
    private double nota;

    // Constructor
    public Student(String nume, int varsta, double nota) {
        this.nume = nume;
        this.varsta = varsta;
        this.nota = nota;
    }

    // Getters și Setters
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

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Student [nume=" + nume + ", varsta=" + varsta + ", nota=" + nota + "]";
    }
}
