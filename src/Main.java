import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hak = 6;  
        String word = "orange";  
        boolean istrue = true;

        StringBuilder cizgiBuilder = new StringBuilder("______");

        Scanner sc = new Scanner(System.in);

        while (hak > 0) {
            System.out.println("Guess the word: " + cizgiBuilder);

            
            System.out.print("Bir karakter girin: ");
            char karak = sc.next().charAt(0); 

            boolean isFound = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == karak) {
                    cizgiBuilder.setCharAt(i, word.charAt(i));  
                    isFound = true;
                }
            }

           
            if (!isFound) {
                hak--;
                System.out.println("Yanlış tahmin! Kalan hak: " + hak);
            }

           
            if (cizgiBuilder.toString().equals(word)) {
                System.out.println("Tebrikler, kelimeyi doğru tahmin ettiniz: " + word);
                break;
            }

         
            if (hak == 0) {
                System.out.println("Maalesef kaybettiniz! Doğru kelime: " + word);
            }
        }

        sc.close();
    }
}


