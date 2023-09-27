public class IfThenElse {
    public static void main(String[] args) {
        // Kleines Alterscript
        int ueber18 = 5; // Altersangabe
        if (ueber18 >= 18) { // Prüft Ob über 18 dann ausgabe
            System.out.println("Ich bin " + ueber18 + " Jahre alt");

        } else { // Wenn jünger als 18
            int Alter18 = 18;
            int Diff = Alter18 - ueber18;

            System.out.println("Ich bin " + Diff + " Jahre jünger als 18.");
        }
    }
}
