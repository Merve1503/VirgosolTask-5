import java.util.ArrayList;

public class Task12 {

    /*
    12. Bir ArrayList oluşturun ve içine birkaç kelime ekleyin.
    Her kelimenin içindeki belirli bir harfin sayısını bulan bir metot yazın ve sonucu ekrana yazdırın.
     */

    public static void main(String[] args) {
        // ArrayList oluşturma ve içine kelimeler ekleme
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("orange");
        words.add("grape");

        // Her kelimenin içindeki 'a' harfi sayısını bulma ve sonucu ekrana yazdırma
        char targetChar = 'a';
        for (String word : words) {
            int count = countChar(word, targetChar);
            System.out.println("'" + targetChar + "' harfi " + word + " kelimesinde " + count + " kez geçiyor.");
        }
    }

    // Bir kelimenin içinde belirli bir harfin kaç kez geçtiğini bulan metot
    public static int countChar(String word, char target) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}
