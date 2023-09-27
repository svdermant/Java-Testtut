import java.util.Scanner;
public class IfThenElse {
        public static void main(String[] args) {
            Scanner altscan = new Scanner(System.in);
            int ueber18;
            System.out.println("Bitte sag mir dein Alter?");
        // Kleines Alterscript
        ueber18 = altscan.nextInt(); // Alterscanner
        if (ueber18 >= 18) { // Prüft Ob über 18 dann ausgabe
            System.out.println("Du bist " + ueber18 + " Jahre alt");

        } else { // Wenn jünger als 18
            System.out.println("Du bist jünger als 18 Jahre");
            System.out.println("Du bist genau: " + ueber18 + " Jahre Alt!");
        }
    }
}
