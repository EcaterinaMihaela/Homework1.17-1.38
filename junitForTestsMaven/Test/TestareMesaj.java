import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestareMesaj
{
    @Test
    public void test3()
    {
        //in test 3 creez un obj de tip Informatiii
        Informatii mesaj1 = new Informatii();
        //aplic metoda informare pe obj
        assertEquals("Prezentati-va la ora 3!",mesaj1.informare("Prezentati-va la ora 3!"));
    }

    @Test
    public void test4()
    {
        //in test 3 creez un obj de tip Mesaj
        Informatii mesaj2 = new Informatii();
        //aplic metoda informare pe obj
        assertEquals("Nu va pregatiti!",mesaj2.informare("Prezentati-va la ora 3!"));
    }
}

