import java.util.Random;

public class Task2 {

    /*
    2. 100 adet rastgele sayının bulunduğu bir dizi oluşturun.
    Bu sayıların ortalamasını hesaplayın ve ortalamadan büyük olan sayıların kaç tane olduğunu bulun.
     */

    public static void main(String[] args) {
        // 100 adet rastgele sayı içeren bir dizi oluşturma
        int[] numbers = new int[100];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100); // 0 ile 99 arasında rastgele sayı
        }

        // Sayıların ortalamasını hesaplama
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;

        // Ortalamadan büyük olan sayıların sayısını bulma
        int count = 0;
        for (int number : numbers) {
            if (number > average) {
                count++;
            }
        }

        // Sonuçları ekrana yazdırma
        System.out.println("Ortalama: " + average);
        System.out.println("Ortalamadan büyük olan sayıların sayısı: " + count);
    }
}
