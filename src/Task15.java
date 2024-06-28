import java.util.ArrayList;
import java.util.Collections;

public class Task15 {

    /*
    15. Bir ArrayList oluşturun ve içine birkaç kelime ekleyin.
    Listenin başına ve sonuna yeni kelimeler ekleyin, ardından listeyi sıralayın ve sonucu ekrana yazdırın.
     */

    public static void main(String[] args) {
        // ArrayList oluşturma ve içine kelimeler ekleme
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("orange");

        // Listenin başına ve sonuna yeni kelimeler ekleme
        words.add(0, "cherry"); // başa ekleme
        words.add("grape");     // sona ekleme

        // Listeyi sıralama
        Collections.sort(words);

        // Sonucu ekrana yazdırma
        System.out.println("Sıralanmış liste: " + words);
    }
}
