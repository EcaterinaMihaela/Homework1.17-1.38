public class Student
{
    private String nume;
    private float nota;

    public Student(String nume, float nota)
    {
        this.nume = nume;
        this.nota = nota;
    }

    public float getNota()
    {
        return nota;
    }
    public String getNume()
    {
        return nume;
    }
    @Override
    public String toString() {
        return nume + " - Nota: " + nota;
    }
}
