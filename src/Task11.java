import java.util.Arrays;

public class Task11 {

    /*
    11. int tipinde bir dizi oluşturun ve bu diziyi sıralayan bir metot yazın.
    Bu metodu çağırarak sonucu ekrana yazdırın.
     */

    public static void main(String[] args) {
        // int tipinde bir dizi oluşturma
        int[] numbers = {45, 12, 78, 34, 56, 23};

        // Diziyi sıralayan metodu çağırma
        sortArray(numbers);

        // Sonucu ekrana yazdırma
        System.out.println("Sıralanmış dizi: " + Arrays.toString(numbers));
    }

    // int tipinde bir diziyi sıralayan metod
    public static void sortArray(int[] array) {
        Arrays.sort(array);
    }
}
