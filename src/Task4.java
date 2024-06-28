import java.util.Scanner;

public class Task4 {

    /*
    4. int tipinde bir dizi oluşturun ve kullanıcıdan bir sayı alın.
    Bu sayının dizide olup olmadığını kontrol edin ve sonucu ekrana yazdırın.
     */

    public static void main(String[] args) {
        // int tipinde bir dizi oluşturma
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Kullanıcıdan bir sayı alma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int userInput = scanner.nextInt();

        // Sayının dizide olup olmadığını kontrol etme
        boolean found = false;
        for (int number : numbers) {
            if (number == userInput) {
                found = true;
                break;
            }
        }

        // Sonucu ekrana yazdırma
        if (found) {
            System.out.println("Sayı dizide mevcut.");
        } else {
            System.out.println("Sayı dizide mevcut değil.");
        }
        scanner.close();
    }
}
