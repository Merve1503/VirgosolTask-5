public class Task10 {

    /*
    10. int ve double tipinde iki sayının toplamını bulan iki farklı metot yazın.
    Bu metotları kullanarak çeşitli toplama işlemleri yapın ve sonucu ekrana yazdırın.
     */

    public static void main(String[] args) {
        // int tipinde toplama işlemi
        int resultInt1 = sum(5, 10);
        int resultInt2 = sum(15, 20);

        // double tipinde toplama işlemi
        double resultDouble1 = sum(3.5, 2.7);
        double resultDouble2 = sum(10.2, 5.5);

        // Sonuçları ekrana yazdırma
        System.out.println("int tipinde 5 + 10 = " + resultInt1);
        System.out.println("int tipinde 15 + 20 = " + resultInt2);
        System.out.println("double tipinde 3.5 + 2.7 = " + resultDouble1);
        System.out.println("double tipinde 10.2 + 5.5 = " + resultDouble2);
    }

    // int tipinde toplama metodu
    public static int sum(int a, int b) {
        return a + b;
    }

    // double tipinde toplama metodu
    public static double sum(double a, double b) {
        return a + b;
    }
}
