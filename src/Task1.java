import java.util.ArrayList;

public class Task1 {

    /*
    1. ArrayList sınıfını kullanarak bir ArrayList oluşturun ve içine 5 farklı şehir ekleyin. Bu şehirleri ekrana yazdırın.
     */

    public static void main(String[] args) {
        // ArrayList oluşturma
        ArrayList<String> cities = new ArrayList<>();

        // Şehirleri ekleme
        cities.add("Istanbul");
        cities.add("Ankara");
        cities.add("Izmir");
        cities.add("Bursa");
        cities.add("Antalya");

        // Şehirleri ekrana yazdırma
        System.out.println("Şehirler:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
