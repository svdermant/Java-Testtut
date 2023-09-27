import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Operatoren {
    public static void main(String[] args) {
        //Logische Operatoren sind Grundlage in Java für Professionalen Code
        // ! <- Nicht Operator (Beispiel if (!(temperatur > 20)) Wenn temparatur nicht > 20
        // Bedeutet das gleiche wie (Temparatur <= 20)
        // && <- Und Operator Besagt wenn if bedingung1 und if bedingung2 zutrifft führe code aus.
        // || <- Oder Operator Besagt das eine beidingung Mindestens erfüllt sein muss um Code auszuführen.
        // Letzter Operator wäre das Exclusive or (^)
        // Bei einem Spiel wird ein Gewinner festgelegt entweder jan oder tim wenn einer von beiden gewonnen hat
        // Hierbei trifft die bedingung nur zu wenn eine der Angegeben werte ein true wiedergibt
        // beide werte auf false oder true geben ein false zurück.
        // Beispiel:
        boolean jan_gewonnen = true;
        boolean tim_gewonnen = false;

        //If Statement
        if(jan_gewonnen ^ tim_gewonnen) {
            System.out.println("Richtiges Ergebnis");
        } else {
            System.out.println("Falsches Ergebniss");
        }

        double temperatur = 5.5; // 45° Sind nicht Angenehm Die folgende If Bedingung liefert also ein
        // Falsches ergebnis!
        // Lösung wäre eine 2. If anweisung unter der 1. einzubinden die besagt
        // Das Temparatur ebenfalls kleiner als 35 ist....

        // Hier sieht man das mindestens 1. Bedingung Zutreffen muss
        // Geändert wurde die Teparatur auf 5.5
        // Ausgabe ist also Unangenehm weil 5.5 Grad kleiner als 20 ist.
        if (temperatur < 20 || temperatur > 35) {
            System.out.println("unangenehm");
        } else {
            System.out.println("Angenehm");
        }
    }
}

