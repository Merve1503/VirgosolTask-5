import java.util.ArrayList;
import java.util.Scanner;

public class Task16 {

    /*
    16. Bir ArrayList kullanarak kullanıcıdan alınan 10 farklı tam sayıyı saklayın.
    Bu tam sayılardan kaç tanesinin çift, kaç tanesinin tek olduğunu bulan ve sonucu ekrana yazdıran bir program yazın.
     */

    public static void main(String[] args) {
        // Kullanıcıdan 10 farklı tam sayı alınması
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen 10 farklı tam sayı girin:");

        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        // Çift ve tek sayıların sayısını bulma
        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Sonucu ekrana yazdırma
        System.out.println("Girilen tam sayılardan:");
        System.out.println(evenCount + " tanesi çift sayıdır.");
        System.out.println(oddCount + " tanesi tek sayıdır.");

        scanner.close();
    }
}
