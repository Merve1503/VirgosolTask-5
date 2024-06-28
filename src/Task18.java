import java.util.ArrayList;
import java.util.Collections;

public class Task18 {

    /*
    18. Bir ArrayList oluşturun ve içine birkaç kelime ekleyin.
    Her kelimenin uzunluğunu tutan bir ArrayList daha oluşturun ve bu uzunlukları sıralı olarak ekrana yazdırın.
    Son olarak, en uzun ve en kısa kelimeleri bularak ekrana yazdırın.
     */

    public static void main(String[] args) {
        // ArrayList oluşturma ve içine kelimeler ekleme
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("orange");
        words.add("grape");
        words.add("pineapple");

        // Her kelimenin uzunluğunu tutacak ArrayList oluşturma
        ArrayList<Integer> lengths = new ArrayList<>();
        for (String word : words) {
            lengths.add(word.length());
        }

        // Uzunlukları sıralama
        Collections.sort(lengths);

        // Uzunlukları sıralı olarak ekrana yazdırma
        System.out.println("Kelime Uzunlukları (sıralı): " + lengths);

        // En uzun ve en kısa kelimeleri bulma
        int shortestLength = lengths.get(0);
        int longestLength = lengths.get(lengths.size() - 1);

        String shortestWord = null;
        String longestWord = null;

        for (String word : words) {
            if (word.length() == shortestLength) {
                shortestWord = word;
            }
            if (word.length() == longestLength) {
                longestWord = word;
            }
        }

        // Sonucu ekrana yazdırma
        System.out.println("En kısa kelime: " + shortestWord + " (" + shortestLength + " karakter)");
        System.out.println("En uzun kelime: " + longestWord + " (" + longestLength + " karakter)");
    }
}
