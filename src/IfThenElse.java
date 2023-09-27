public class IfThenElse {
    public static void main(String[] args) {
        int number = 1;
        boolean erhöhen = (number <= 5); // Anmerkung in einem Boolean kann man also eine Bedingung
                                         // Für ein IF statement festlegen.
        if (erhöhen) {
            number += 3;
            System.out.println(number);

        } else {
            System.out.println(number);
        }
    }
}
