import java.util.ArrayList;

public class Task3 {

    /*
    3. int, double ve boolean tiplerinde 3 farklı değeri tutan bir ArrayList oluşturun ve bu değerleri ekrana yazdırın.
    */

    public static void main(String[] args) {
        // Object türünde bir ArrayList oluşturma
        ArrayList<Object> values = new ArrayList<>();

        // Farklı türde değerleri ekleme
        values.add(42);      // int
        values.add(3.14);    // double
        values.add(true);    // boolean

        // Değerleri ekrana yazdırma
        System.out.println("Değerler:");
        for (Object value : values) {
            System.out.println(value);
        }
    }
}
