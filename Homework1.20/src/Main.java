public class Main
{
    public static void main(String[] args)
    {
        GestionareStudenti manager = new GestionareStudenti();

        manager.adaugareStudenti(new Student("Amna",8.5f,20));
        manager.adaugareStudenti(new Student("MAria",7.5f,21));
        manager.adaugareStudenti(new Student("Andrei",6.5f,20));

        System.out.println("Lista studentilor: ");
        manager.afiseazaStudenti();

        //afiseaza student cel mai in varsta:
        Student celMaiInVarsta = manager.gasesteStudentVarstaMaxima();
        System.out.println("\nStudentul cu vartsa cea mai mare : "+celMaiInVarsta);
    }
}
