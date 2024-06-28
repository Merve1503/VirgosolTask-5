public class Task7 {

    /*
    7. int tipinde bir dizi oluşturun ve bu diziyi tersine çeviren bir metot yazın.
    Bu metodu çağırarak sonucu ekrana yazdırın.
     */

    public static void main(String[] args) {
        // int tipinde bir dizi oluşturma
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Diziyi tersine çeviren metodu çağırma
        reverseArray(numbers);

        // Sonucu ekrana yazdırma
        System.out.print("Tersine çevrilmiş dizi: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    // Diziyi tersine çeviren metod
    public static void reverseArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
    }
}
