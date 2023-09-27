// Für eine Nutzereingabe müssen Daten gespeichert und eingelesen werden
// hierbei hilft der import des Scanners
// Dieser Import hat schon Vordefinierte Funktionen die es ermöglichen Nutzereingaben einzulesen etc..
import java.util.Scanner;

public class NutzerEingabe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Ermöglicht das Einlesen von daten.
        String sentense; // Hier wird dann der Eingegebene Satz (String) gespeichert.
        int zahl; // Hier wird eine Zahl als Integer gespeichert

        System.out.println("Bitte gib eine Zahl ein!"); //Aufforderung einen Satz einzugeben.

        //sentense = scan.nextLine(); //Eingabe wird gespeichert in sentense
        zahl = scan.nextInt(); //Eingabe wird gespeichert in zahl

        System.out.println("Deine Zahl war: " + (zahl + 1));

    }
}
