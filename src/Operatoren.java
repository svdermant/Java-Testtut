public class Operatoren {
    public static void main(String[] args) {
        //Logische Operatoren sind Grundlage in Java für Professionalen Code
        // ! <- Nicht Operator (Beispiel if (!(temperatur > 20)) Wenn temparatur nicht > 20
        // Bedeutet das gleiche wie (Temparatur <= 20)

        double temperatur = 25.5; // 45° Sind nicht Angenehm Die folgende If Bedingung liefert also ein
                                  // Falsches ergebnis!
                                  // Lösung wäre eine 2. If anweisung unter der 1. einzubinden die besagt
                                  // Das Temparatur ebenfalls kleiner als 35 ist....

        if (temperatur > 20) {
            if (temperatur < 35) {
                System.out.println("Angenehm");
                }
            } else {
            System.out.println("unangenehm");
        }
    }
}
