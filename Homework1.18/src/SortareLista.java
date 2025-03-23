import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortareLista
{
    public static void main(String[] args)
    {
        List<Integer> lista = new ArrayList<>();

        lista.add(4);
        lista.add(3);
        lista.add(1);
        lista.add(6);
        lista.add(560);
        lista.add(21);

        //Metoda Collections.sort() utilizează intern TimSort,
        //o variantă optimizată a MergeSort și InsertionSort
        //si face parte fin libraria Collections
        Collections.sort(lista);

        System.out.println("Lista sortata: "+lista);
    }
}