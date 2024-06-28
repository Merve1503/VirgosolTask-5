import java.util.ArrayList;

public class Task13 {

    /*
    13. Bir ArrayList oluşturun ve içine birkaç Integer değer ekleyin.
    Bu Integer değerlerin her birinin rakamlarının toplamını hesaplayın ve bu toplamları ekrana yazdırın.
    Örneğin, listede 123 varsa, rakamların toplamı 6 olmalıdır (1 + 2 + 3).
     */

    public static void main(String[] args) {
        // ArrayList oluşturma ve içine Integer değerler ekleme
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(123);
        numbers.add(456);
        numbers.add(789);
        numbers.add(321);

        // Her bir Integer değerin rakamlarının toplamını hesaplama ve ekrana yazdırma
        for (Integer number : numbers) {
            int sumOfDigits = calculateSumOfDigits(number);
            System.out.println("Sayı: " + number + ", Rakamlarının Toplamı: " + sumOfDigits);
        }
    }

    // Bir Integer değerin rakamlarının toplamını hesaplayan metot
    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        String numberStr = String.valueOf(number);
        for (int i = 0; i < numberStr.length(); i++) {
            char digitChar = numberStr.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            sum += digit;
        }
        return sum;
    }
}
