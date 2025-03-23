import java.util.Scanner;

public class ecuatie
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduceți coeficientul a: ");
            double a = citesteCoeficient(scanner);
            System.out.print("Introduceți coeficientul b: ");
            double b = citesteCoeficient(scanner);
            System.out.print("Introduceți coeficientul c: ");
            double c = citesteCoeficient(scanner);

            if (a == 0) {
                throw new IllegalArgumentException("Coeficientul 'a' nu poate fi zero, deoarece nu mai este o ecuație de gradul 2.");
            }

            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                // Două soluții reale
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Soluțiile ecuației sunt: x1 = " + x1 + " și x2 = " + x2);
            } else if (delta == 0) {
                // O soluție reală
                double x = -b / (2 * a);
                System.out.println("Ecuația are o singură soluție: x = " + x);
            } else {
                // Nu există soluții reale
                System.out.println("Ecuația nu are soluții reale.");
            }
        }catch(NumberFormatException e)
            {
                System.out.println("Eroare: Trebuie să introduceți doar numere valide.");
            }catch (Exception e) {
                System.out.println("Eroare neașteptată: " + e.getMessage());
            } finally{
                scanner.close();
            }

    }
    private static double citesteCoeficient(Scanner scanner)
    {
        String input = scanner.nextLine();
        if(input.isEmpty())
        {
            throw new NumberFormatException("Inputul nu poate fi gol.");
        }
        try
        {
            return Double.parseDouble(input);
        }catch(NumberFormatException e)
        {
            throw new NumberFormatException("Inputul trb sa fie un nr valid");
        }
    }
}
