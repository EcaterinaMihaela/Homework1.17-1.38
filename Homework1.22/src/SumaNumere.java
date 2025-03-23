import java.util.Scanner;

public class SumaNumere
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Integer num1 = null, num2 = null;

        try{
            System.out.println("Introdu primul nr: ");
            String input1 = scanner.nextLine();
            if(!input1.isEmpty())
            {
                num1 = Integer.parseInt(input1);
            }

            System.out.print("Introdu al doilea nr: ");
            String input2 = scanner.nextLine();
            if (!input2.isEmpty())
            {
                num2 = Integer.parseInt(input2);
            }

            if (num1 == null || num2 == null)
            {
                throw new NullPointerException("Unul dintre numere este NULL!");
            }

            //suma
            int suma = num1 + num2;
            System.out.println("Suma: " + suma);
        }
        catch(NumberFormatException e)
        {
            System.out.println("exceptie: " +e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}
