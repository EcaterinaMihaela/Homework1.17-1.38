import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
public class Lab2
{
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL pageUrl = new URL("https://www.ucv.ro");// SAU http://www.ucv.ro/index.php
        URLConnection getConn = pageUrl.openConnection();
        getConn.connect();
        BufferedReader dis = new BufferedReader(
                new InputStreamReader(
                        getConn.getInputStream()));
        String myString;
        while ((myString = dis.readLine()) != null)
        {
            System.out.println(myString);
        }
    }
}