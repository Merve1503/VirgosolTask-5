import java.util.ArrayList;
import java.util.Collections;

public class Task14 {

    /*
    14. Bir ArrayList oluşturun ve içine birkaç sayı ekleyin.
    Bu sayılar arasından en küçük ve en büyük sayıları bulun ve sonucu ekrana yazdırın.
     */

    public static void main(String[] args) {
        // ArrayList oluşturma ve içine sayılar ekleme
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(25);
        numbers.add(10);
        numbers.add(45);
        numbers.add(30);
        numbers.add(15);

        // En küçük ve en büyük sayıları bulma
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        // Sonucu ekrana yazdırma
        System.out.println("ArrayList içindeki en küçük sayı: " + min);
        System.out.println("ArrayList içindeki en büyük sayı: " + max);
    }
}
