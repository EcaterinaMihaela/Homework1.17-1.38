import java.util.ArrayList;

public class App
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        // Varianta cu array (oferă un "final" workaround pentru lambda)
        final int[] sum = {0};  //fol deoarece variabilele non-final nu pot fi modificate în expresii lambda.
        numbers.forEach(n -> sum[0] += n);  //parcurge fiec el si l adauga la suma

        System.out.println("Suma elementelor: " + sum[0]);

        /*Variantacu reduce()
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 8, 1));

        int sum = numbers.stream().reduce(0, (a, b) -> a + b);

        System.out.println("Suma elementelor: " + sum);*/
    }
}
