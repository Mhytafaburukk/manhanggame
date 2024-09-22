import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hak = 6;  // Kalan hak
        String word = "orange";  // Tahmin edilmesi gereken kelime
        boolean istrue = true;

        // Kelimenin baştaki durumu (örneğin "______")
        StringBuilder cizgiBuilder = new StringBuilder("______");

        Scanner sc = new Scanner(System.in);

        while (hak > 0) {
            System.out.println("Guess the word: " + cizgiBuilder);

            // Kullanıcıdan bir karakter alınır
            System.out.print("Bir karakter girin: ");
            char karak = sc.next().charAt(0);  // İlk karakter alınır

            boolean isFound = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == karak) {
                    cizgiBuilder.setCharAt(i, word.charAt(i));  // Doğru tahmin edilen harf yerleştirilir
                    isFound = true;
                }
            }

            // Eğer karakter yanlış tahmin edilirse hak azalır
            if (!isFound) {
                hak--;
                System.out.println("Yanlış tahmin! Kalan hak: " + hak);
            }

            // Eğer kelimenin tamamı doğru tahmin edildiyse oyun biter
            if (cizgiBuilder.toString().equals(word)) {
                System.out.println("Tebrikler, kelimeyi doğru tahmin ettiniz: " + word);
                break;
            }

            // Haklar biterse oyun kaybedilir
            if (hak == 0) {
                System.out.println("Maalesef kaybettiniz! Doğru kelime: " + word);
            }
        }

        sc.close();
    }
}


