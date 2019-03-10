import java.util.Scanner;

/**
 * @author nieckarz
 */
public class InitPogoda {
    public static void main(String[] args) {
        SerwisPogody sp = new SerwisPogody("http://api.apixu.com/v1/current.json?key=","9889be10aad4447183a115547191003");
        Pogoda pog = new Pogoda();
        System.out.println("Podaj Miasto: ");
        Scanner nw = new Scanner(System.in);
        String miasto = nw.nextLine();
        System.out.println(sp.getCityPogoda(miasto).getCurrent().getTemp_c());
    }
}
