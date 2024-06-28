import java.util.ArrayList;

public class Task20 {

    /*
    20. Bir ArrayList oluşturun ve içine birkaç Double değer ekleyin.
    Bu değerlerden en büyük ve en küçük olanını bulun.
    Ardından, listedeki tüm elemanların ortalamasını hesaplayın ve bu ortalamayı ekrana yazdırın.
    Son olarak, listedeki her elemanı ortalamadan büyük mü küçük mü diye kontrol edin ve sonuçları ayrı ayrı ekrana yazdırın.
     */

    public static void main(String[] args) {
        // ArrayList oluşturup içine Double değerler ekleyelim
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(3.5);
        numbers.add(7.2);
        numbers.add(1.8);
        numbers.add(5.9);
        numbers.add(2.4);

        // En büyük ve en küçük değerleri bulalım
        double max = numbers.get(0);
        double min = numbers.get(0);

        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        // Tüm elemanların ortalamasını hesaplayalım
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double average = sum / numbers.size();

        // Her bir elemanın ortalamadan büyük mü küçük mü olduğunu kontrol edelim
        System.out.println("En büyük değer: " + max);
        System.out.println("En küçük değer: " + min);
        System.out.println("Ortalama: " + average);

        System.out.println("Her elemanın ortalamadan büyük veya küçük olma durumu:");
        for (double num : numbers) {
            if (num > average) {
                System.out.println(num + " ortalamadan büyük");
            } else if (num < average) {
                System.out.println(num + " ortalamadan küçük");
            } else {
                System.out.println(num + " ortalamaya eşit");
            }
        }
    }
}
