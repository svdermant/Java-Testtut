public class Operatoren {
    public static void main(String[] args) {
        //Logische Operatoren sind Grundlage in Java für Professionalen Code
        // ! <- Nicht Operator (Beispiel if (!(temperatur > 20)) Wenn temparatur nicht > 20
        // Bedeutet das gleiche wie (Temparatur <= 20)

        double temperatur = 45.5; // 45° Sind nicht Angenehm Die folgende If Bedingung liefert also ein
                                  // Falsches ergebnis!

        if (temperatur > 20) {
            System.out.println("Angenehm");
        } else {
            System.out.println("unangenehm");
        }
    }
}
