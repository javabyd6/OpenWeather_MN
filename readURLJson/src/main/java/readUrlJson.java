import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * @author nieckarz
 */
public class readUrlJson {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        Scanner nw = new Scanner(System.in);
        System.out.println("Podaj miasto");
        String miasto = nw.nextLine();
        try {
            URL url = new URL("http://api.apixu.com/v1/current.json?key=9889be10aad4447183a115547191003&q="+miasto);
            Pogoda pogoda = mapper.readValue(url,Pogoda.class);
            System.out.println("temperatuta dla miasta " + miasto + " aktualnie wynosi " + pogoda.current.getTemp_c());
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
