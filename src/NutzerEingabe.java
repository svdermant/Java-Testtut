// Für eine Nutzereingabe müssen Daten gespeichert und eingelesen werden
// hierbei hilft der import des Scanners
// Dieser Import hat schon Vordefinierte Funktionen die es ermöglichen Nutzereingaben einzulesen etc..
import java.util.Scanner;

public class NutzerEingabe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Ermöglicht das Einlesen von daten.
        String sentense; // Hier wird dann der Eingegebene Satz gespeichert.

        System.out.println("Bitte gib einen Satz ein!"); //Aufforderung einen Satz einzugeben.

        sentense = scan.nextLine(); //Eingabe wird gespeichert in sentense

        System.out.println("Dein Satz war: H" + sentense);

    }
}
