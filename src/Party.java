public class Party {
    public static void main(String[] args) {
        int guests;

        guests = 10;  //Hierbei wird guest immer mit dem
        guests = 9;   //Letzten zugewiesenen Wert beschrieben
        guests = 12;  //Kann so fortgeführt werden.

        //Anwendungsbeispiele
        int gast = 10;

        //Entferne diesen Code
        //gast = 10 + 1; //gast wird um 1 Erhöht
        //gast = 11 + 3; //Gast wird um 3 erhöht.
        //Entfernen!!!

        //Wie kann ich also gast immer um jeweils 1 für absagen und 3 für zusagen ausgeben lassen.
        gast = gast + 1; //Zusage
        System.out.println("Zusage: " + gast);
        gast = gast - 3; //Absagen
        System.out.println("Absagen: " + gast);

        //Es geht aber auch einfacher
        gast -= 1; //Absage
        System.out.println("Absagen: " + gast);
        gast += 3; //Zusage
        System.out.println("Zusage: " + gast);

        //Aber noch einfacher wäre

        gast--; //verringert um 1
        gast++; //erhöhung um 1.

        System.out.println("Anzahl der Gäste die kommen: " + gast);
    }
}
