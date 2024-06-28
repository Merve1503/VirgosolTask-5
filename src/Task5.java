public class Task5 {

    /*
    5. int tipinde bir dizi oluşturun ve bu dizideki en büyük sayıyı bulan bir metot yazın.
    Bu metodu çağırarak sonucu ekrana yazdırın.
    */

    public static void main(String[] args) {
        // int tipinde bir dizi oluşturma
        int[] numbers = {34, 67, 23, 90, 12, 75, 33, 56, 88, 99};

        // En büyük sayıyı bulan metodu çağırma
        int largestNumber = findLargestNumber(numbers);

        // Sonucu ekrana yazdırma
        System.out.println("Dizideki en büyük sayı: " + largestNumber);
    }

    // En büyük sayıyı bulan metod
    public static int findLargestNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
