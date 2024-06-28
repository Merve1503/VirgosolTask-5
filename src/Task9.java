import java.util.ArrayList;

public class Task9 {

    /*
    9. Bir ArrayList oluşturun ve içine birkaç Integer değer ekleyin.
    Bu değerlerin ortalamasını hesaplayın.
    Ardından, listedeki her elemanın ortalamadan büyük mü küçük mü olduğunu kontrol edin
    ve ortalamanın üstündeki ve altındaki değerleri ayrı ayrı ekrana yazdırın.
     */

    public static void main(String[] args) {
        // ArrayList oluşturma ve içine Integer değerler ekleme
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Değerlerin ortalamasını hesaplama
        double average = calculateAverage(numbers);

        // Ortalamadan büyük olan ve küçük olan değerleri ayırma ve ekrana yazdırma
        System.out.println("Ortalama: " + average);
        System.out.print("Ortalamadan büyük olanlar: ");
        boolean first = true;
        for (Integer number : numbers) {
            if (number > average) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(number);
                first = false;
            }
        }
        System.out.println();
        System.out.print("Ortalamadan küçük olanlar: ");
        first = true;
        for (Integer number : numbers) {
            if (number < average) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(number);
                first = false;
            }
        }
        System.out.println();
    }

    // ArrayList içindeki Integer değerlerin ortalamasını hesaplama
    public static double calculateAverage(ArrayList<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.size();
    }
}
