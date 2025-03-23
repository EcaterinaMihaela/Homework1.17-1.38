import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
public class SortareStudenti
{
    public static void main (String args[])
    {
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Ana",5));
        studenti.add(new Student("Maria",6));
        studenti.add(new Student("Ionut",10));
        studenti.add(new Student("Minodora",9));

        Collections.sort(studenti, Comparator.comparingDouble(Student::getNota));

        System.out.println("Lista ordonata dupa nota: ");
        for(Student s:studenti)
        {
            System.out.println(s);
        }
    }
}
