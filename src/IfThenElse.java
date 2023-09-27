public class IfThenElse {
    public static void main(String[] args) {
        int number = 2;
        if (number != 5) { // Bedingung ist immer ein Wert der Wahr oder Falsch ist.
                        // Kriterium ob der Code von dem If block oder Else Block ausgefürt wird.
                        // int number = 5 Ist eine Zuweisung
                        // number == 5 Ist ein Test (Prüfung ob die Zuweisung von Number gleich 5 ist).
                        // Beim Ausführe Gibt die Bedingung ein Wahr zurück.
                        // Wird die Zuweisung geändert z.b auf 2
                        // Dann trifft die Bedingung nicht mehr zu und else wird ausgeführt.
                        // Will Man das Bedingung unwahr ist so muss man aus Number == 5
                        // Ein number != 5 machen.
                        // Gegebenfalls die Sysouts anpassen
            System.out.println("Number ist ungleich 5");

        } else { // Wird ausgefürt wenn Bedingung Falsch
                 // Leitet sich also immer davon ab ob die Bedingung im If zutrifft oder nicht
                 // Else braucht also in dem falle kein Bedingungswert
            System.out.println("Number ist gleich 5");
        }
    }
}
