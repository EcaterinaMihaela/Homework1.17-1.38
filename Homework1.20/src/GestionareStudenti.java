import java.util.*;

public class GestionareStudenti
{
    private List<Student> ListaStudenti;
    private HashMap<String,Student> mapStudenti;

    public GestionareStudenti()
    {
        this.ListaStudenti = new ArrayList<>() ;
        this.mapStudenti = new HashMap<>();
    }

    public void adaugareStudenti(Student student)
    {
        this.ListaStudenti.add(student);
        this.mapStudenti.put(student.getNume(),student);
    }

    public Student gasesteStudentVarstaMaxima()
    {
        return Collections.max(ListaStudenti, Comparator.comparingInt(Student::getVarsta));
    }
    public void afiseazaStudenti()
    {
        for(Student s:ListaStudenti)
        {
            System.out.println(s);
        }
    }
}
