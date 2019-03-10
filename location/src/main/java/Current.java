import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nieckarz
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Current {

  double last_updated_epoch;
  String last_updated;
  float temp_c;
  float temp_f;
  int is_Day;
  Condition condition;
  float wind_mph;
  float wind_kph;
  float wing_degree;
  String wind_dir;
  float pressure_mb;
  float pressure_in;
  float precip_mm;
  float precip_in;
  float humidity;
  float cloud;
  float feelslike_c;
  float feelslike_f;
  float vis_km;
  float vis_miles;
  float uv;
}


