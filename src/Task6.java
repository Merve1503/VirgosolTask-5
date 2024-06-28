import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {

    /*
    6. Bir ArrayList oluşturun ve içine birkaç sayı ekleyin.
    Belirli bir indekste bulunan sayıyı başka bir sayıyla değiştirin ve sonucu ekrana yazdırın.
     */

    public static void main(String[] args) {
        // ArrayList oluşturma ve içine birkaç sayı ekleme
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Kullanıcıdan indeks ve yeni değer alma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Değiştirmek istediğiniz indeks: ");
        int index = scanner.nextInt();
        System.out.print("Yeni değer: ");
        int newValue = scanner.nextInt();

        // Belirli bir indekste bulunan sayıyı başka bir sayıyla değiştirme
        if (index >= 0 && index < numbers.size()) {
            numbers.set(index, newValue);
            System.out.println("ArrayList'in güncel hali: " + numbers);
        } else {
            System.out.println("Geçersiz indeks: " + index);
        }

        scanner.close();
    }
}
