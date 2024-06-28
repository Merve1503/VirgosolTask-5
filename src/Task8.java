import java.util.ArrayList;

public class Task8 {

    /*
    8. Bir ArrayList oluşturun ve içine Integer wrapper sınıfı kullanarak birkaç sayı ekleyin.
    Bu sayıları ekrana yazdırın ve ardından toplamını hesaplayarak ekrana yazdırın.
     */

    public static void main(String[] args) {
        // ArrayList oluşturma ve içine Integer wrapper sınıfı kullanarak birkaç sayı ekleme
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Sayıları ekrana yazdırma
        System.out.println("ArrayList içindeki sayılar: " + numbers);

        // Sayıların toplamını hesaplama
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        // Toplamı ekrana yazdırma
        System.out.println("Sayıların toplamı: " + sum);
    }
}
