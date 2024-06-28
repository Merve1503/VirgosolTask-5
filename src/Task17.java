import java.util.ArrayList;
import java.util.Collections;

public class Task17 {

    /*
    17. Bir ArrayList oluşturun ve içine 10 farklı tam sayı ekleyin.
    Bu sayıları küçükten büyüğe sıralayın, ardından sıralanmış listeyi tersten yazdırın.
    Son olarak, listedeki her sayının karesini hesaplayarak yeni bir ArrayList içinde saklayın ve bu listeyi ekrana yazdırın.
    */

    public static void main(String[] args) {
        // 1. ArrayList oluşturma ve içine 10 farklı tam sayı ekleme
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(10);
        numbers.add(3);
        numbers.add(7);
        numbers.add(1);
        numbers.add(9);
        numbers.add(4);
        numbers.add(6);

        // 2. Sayıları küçükten büyüğe sıralama
        Collections.sort(numbers);

        // 3. Sıralanmış listeyi tersten yazdırma
        System.out.println("Sıralanmış liste (tersten):");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        // 4. Her sayının karesini hesaplayarak yeni bir ArrayList içinde saklama
        ArrayList<Integer> squares = new ArrayList<>();
        for (int number : numbers) {
            int square = number * number;
            squares.add(square);
        }

        // 5. Karesi alınmış sayıları ekrana yazdırma
        System.out.println("Her sayının karesi:");
        for (int square : squares) {
            System.out.print(square + " ");
        }
        System.out.println();
    }
}
