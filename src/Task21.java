import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task21 {

    /*
    21. ArrayList<String> cities = new ArrayList<>();
    cities.addAll(Arrays.asList("İstanbul", "İzmir", "Ankara", "Antalya", "Çanakkale"));  olan bir cities listesinden "İ" harfi ile başlayan illeri çıkarmak (silmek) istiyorum.
    Bu listenin dinamik olduğunu hangi ilin hangi indekste olduğunu bilmediğimizi kabul ederek çözelim.
     */

    public static void main(String[] args) {
        // ArrayList oluşturup içine şehirleri ekleyelim
        ArrayList<String> cities = new ArrayList<>();
        cities.addAll(Arrays.asList("İstanbul", "İzmir", "Ankara", "Antalya", "Çanakkale"));

        // "İ" harfi ile başlayan şehirleri çıkaralım
        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            String city = iterator.next();
            if (city.startsWith("İ")) {
                iterator.remove();
            }
        }

        // Sonucu ekrana yazdıralım
        System.out.println("İ harfi ile başlamayan şehirler:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
