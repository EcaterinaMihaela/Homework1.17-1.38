import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.List;

public class Streamuri
{
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("ana", "maia", "ionela", "marcela","andreea");

        List<String> rezultat1 = lista.stream()
                .filter(s -> s.startsWith("a"))  //filtrare
                .map(String::toUpperCase)  //mapare la uppercase
                .sorted()  //sortare crescatoare
                .collect(Collectors.toList());

        System.out.println("Rezultat: " + rezultat1);

        List<String> rezultat2 = lista.stream()
                .filter(s -> s.startsWith("a"))  //filtrare
                .map(String::toUpperCase)  //mapare la uppercase
                .sorted(Comparator.reverseOrder()).toList();  //sortare descrescatoare

        System.out.println("Rezultat: " + rezultat2);
    }
}
