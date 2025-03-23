import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class sumaNrFisier
{
    public static void main(String[] args)
    {
        String numeFisier = "date.txt"; // Numele fișierului de citit
        int suma = 0;

        try
        {
            suma = calculeazaSumaNumerelorIntregi(numeFisier);
            System.out.println("Suma nr din fis e: "+suma);
        }catch(IOException e)
        {
            System.out.println("Eroare la citirea fisierului: "+e.getMessage());
        }catch(NumberFormatException e)
        {
            System.out.println("Eroare la conversia unui nr: "+e.getMessage());
        }
    }

    // Metoda pentru calcularea sumei numerelor întregi din fișier
    private static int calculeazaSumaNumerelorIntregi(String numeFisier) throws IOException {
        int suma = 0;
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(numeFisier));
            String linie;

            // Citirea fișierului linie cu linie
            while ((linie = reader.readLine()) != null) {
                try {
                    // converteste linia intr un nr intreg
                    int numarIntreg = Integer.parseInt(linie.trim());  //ignora spatiile
                    suma += numarIntreg; //adauga la suma totala
                } catch (NumberFormatException e) {
                    // daca linia nu este un nr intreg, o ignorăm
                    //debug message
                    System.out.println("Linia ignorată (nu este un număr întreg): " + linie);
                }
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        return suma;
    }
}
