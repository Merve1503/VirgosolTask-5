import java.util.ArrayList;
import java.util.Scanner;

public class Task19 {

    /*
    19. Bir ArrayList oluşturun ve içine 20 rastgele tam sayı ekleyin.
    Kullanıcıdan bir sayı alın ve bu sayının listedeki elemanlarla toplamının 100 olduğu tüm çiftleri bulun ve ekrana yazdırın.
     */

    public static void main(String[] args) {
        Integer[] randomNumbersArray = {1, 2, 3, 4, 5, 1, 8, 9, 10, 2, 11, 4, 3, 6, 13, 9, 7, 5, 6, 8};
        ArrayList<Integer> numbers = new ArrayList<>();
        for (Integer num : randomNumbersArray) {
            numbers.add(num);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int userInput = scanner.nextInt();

        for (Integer num : randomNumbersArray) {
            if (num + userInput == 100) {
                System.out.println("Girdiğiniz sayı ile " + num + " toplamı 100 eder.");
                return;
            }
        }
        System.out.println("Girdiğiniz sayı ile toplamı 100 eden bir sayı bulunamadı.");
    }
}
