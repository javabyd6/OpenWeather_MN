/**
 * @author nieckarz
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Location {

    String name;
    String region;
    String country;
    float lat;
    float lon;
    String tz_id;
    double localtime_epoch;
    String localtime;


}
