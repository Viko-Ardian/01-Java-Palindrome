import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner userInput = new Scanner(System.in);

        String teks;

        System.out.print("Masukkan teks : ");
        teks = userInput.nextLine();

        isPlaindrome(teks);
    }

    public static void isPlaindrome(String teks) {

        String palindrome = "";
        for (int i = (teks.length() - 1); i >= 0; i--) {
            palindrome = palindrome + teks.charAt(i);
        }

        if (teks.equalsIgnoreCase(palindrome)) {
            System.out.println(palindrome + " adalah Teks palindrome");
        } else {
            System.out.println(palindrome + " Bukan Plaindrome");
        }

    }
}
