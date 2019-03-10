import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author nieckarz
 */
public class readWheather {
    static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) {
        try {

            Pogoda wheatherdate = mapper.readValue(new File("current.json"), Pogoda.class);
            System.out.println(wheatherdate.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

