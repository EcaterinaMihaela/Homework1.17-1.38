public class Student
{
    private String nume;
    private float nota;
    private int varsta;

    public Student(String nume,float nota,int varsta)
    {
        this.nume = nume;
        this.nota = nota;
        this.varsta = varsta;
    }

    public int getVarsta()
    {
        return varsta;
    }

    public String getNume()
    {
        return nume;
    }

    public float nota()
    {
        return varsta;
    }

    @Override
    public String toString()
    {
        return nume+"-Varsta: "+varsta+",Nota: "+nota;
    }
}
