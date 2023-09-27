public class IfThenElse {
    public static void main(String[] args) {
        int number = 5;
        if (number == 5) { // Bedingung ist immer ein Wert der Wahr oder Falsch ist.
                        // Kriterium ob der Code von dem If block oder Else Block ausgefürt wird.
                        // int number = 5 Ist eine Zuweisung
                        // number == 5 Ist ein Test (Prüfung ob die Zuweisung von Number gleich 5 ist).
                        // Beim Ausführe Gibt die Bedingung ein Wahr zurück.
            System.out.println("Number ist gleich 5");

        } else { // Wird ausgefürt wenn Bedingung Falsch
                 // Leitet sich also immer davon ab ob die Bedingung im If zutrifft oder nicht
                 // Else braucht also in dem falle kein Bedingungswert
            System.out.println("Number ist ungleich 5");
        }
    }
}
