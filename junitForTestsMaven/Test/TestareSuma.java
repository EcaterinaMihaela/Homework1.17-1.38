import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestareSuma
{
    @Test
    public void test1()
    {
        Suma adunare = new Suma();
        assertEquals(5.9f,adunare.aduna(2.5f,3.4f),0.0001f);  //verifica daca suma da atat
    }

    @Test
    public void test2()
    {
        Suma adunare = new Suma();
        assertEquals(7.0f,adunare.aduna(5.0f,3.0f),0.0001f);
    }
}
